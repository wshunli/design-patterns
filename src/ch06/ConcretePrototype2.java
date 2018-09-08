package ch06;

public class ConcretePrototype2 extends Prototype {
    public static int classFlag = 2;

    @Override
    protected ConcretePrototype2 clone() throws CloneNotSupportedException {
        return (ConcretePrototype2) super.clone();
    }
}
