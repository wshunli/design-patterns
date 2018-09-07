package ch05;

public abstract class Builder {

    public abstract void name(String name);
    public abstract void type(String type);
    public abstract void size(String size);

    public abstract Product build();
}
