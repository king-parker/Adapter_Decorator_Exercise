package Decorator;

import static java.lang.Character.toLowerCase;

public class PiglatinDecorator extends StringDecorator {
    protected PiglatinDecorator(StringSource delegate) {
        super(delegate);
    }

    @Override
    public String next() {
        String word = super.next();

        if (word.isEmpty()) {
            return word;
        }

        word = word.toLowerCase();

        int i;
        for (i = 0; i < word.length(); i++) {
            char c = toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                break;
            }
        }

        return word.substring(i) + word.substring(0,i) + "ay";
    }
}
