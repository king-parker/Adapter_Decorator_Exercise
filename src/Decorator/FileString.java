package Decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileString implements StringSource {
    private Scanner fis;

    public FileString(String filename) {
        try {
            fis = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String next() {
        if (fis.hasNext()) {
            return fis.next();
        }
        else {
            return "";
        }
    }
}
