package Decorator;

public abstract class StringDecorator implements StringSource{
    protected final StringSource delegate;

    protected StringDecorator(StringSource delegate) {
        this.delegate = delegate;
    }

    @Override
    public String next() {
        return delegate.next();
    }
}
