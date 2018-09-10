package ch09;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        System.out.println("ConcreteDecoratorB.sampleOperation() start");
        super.sampleOperation();
        System.out.println("ConcreteDecoratorB.sampleOperation() end");
    }
}
