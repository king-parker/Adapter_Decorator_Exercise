package Decorator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConsoleString implements StringSource {
    private final Queue<String> words;
    private final Scanner in;

    public ConsoleString() {
        words = new LinkedList<>();
        in = new Scanner(System.in);
    }

    @Override
    public String next() {
        if (words.isEmpty()) {
            String line = in.nextLine();
            String[] insertWords = line.split(" ");

            words.addAll(Arrays.asList(insertWords));
        }

        return words.remove();
    }
}
