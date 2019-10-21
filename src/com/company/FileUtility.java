package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * This is a class that loads and saves objects to and from file
 */
public class FileUtility {
    /**
     * @author Fredrik Jönsson
     * This method saves an arraylist to file
     * @param filename the name of the file
     * @param o object to save
     * @param option open option
     */
        public static void saveObject(String filename, Object o, StandardOpenOption... option) {
            Path path = Paths.get(filename);
            try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path, option))) {
                out.writeObject(o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    /**
     * This method takes input from file to an arraylist
     * @param filename name of the file to load
     * @return the object that was loaded
     */
    public static Object loadObject(String filename) {
        Path path = Paths.get(filename);
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))) {
            return in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
