package ch09;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        System.out.println("ConcreteDecoratorA.sampleOperation() start");
        super.sampleOperation();
        System.out.println("ConcreteDecoratorA.sampleOperation() end");
    }
}
