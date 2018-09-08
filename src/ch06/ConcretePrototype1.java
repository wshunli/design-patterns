package ch06;

public class ConcretePrototype1 extends Prototype {
    public static int classFlag = 1;

    @Override
    protected ConcretePrototype1 clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }
}
