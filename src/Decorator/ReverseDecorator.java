package Decorator;

public class ReverseDecorator extends StringDecorator {
    protected ReverseDecorator(StringSource delegate) {
        super(delegate);
    }

    @Override
    public String next() {
        return new StringBuilder(super.next()).reverse().toString();
    }
}
