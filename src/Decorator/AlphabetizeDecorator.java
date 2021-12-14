package Decorator;

import java.util.Arrays;

public class AlphabetizeDecorator extends StringDecorator {
    protected AlphabetizeDecorator(StringSource delegate) {
        super(delegate);
    }

    @Override
    public String next() {
        String word = super.next().toLowerCase();
        char[] chars = word.toCharArray();

        Arrays.sort(chars);
        word = new String(chars);

        return word;
    }
}
