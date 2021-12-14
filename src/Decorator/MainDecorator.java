package Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        System.out.println("Input from file:");
        StringSource source = new AlphabetizeDecorator(new FileString("Decorator/test.txt"));
        String word = source.next();

        while (!word.isEmpty()) {
            System.out.println(word);
            word = source.next();
        }

        System.out.println();
        System.out.println("Input from console (enter an empty line to stop:");

        source = new PiglatinDecorator(new ReverseDecorator(new ConsoleString()));

        word = source.next();

        while (!word.isEmpty()) {
            System.out.println(word);
            word = source.next();
        }
    }
}
