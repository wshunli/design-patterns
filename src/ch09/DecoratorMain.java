package ch09;

public class DecoratorMain {
    public static void main(String[] args) {

        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
        concreteDecoratorA.sampleOperation();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteComponent);
        concreteDecoratorB.sampleOperation();

    }
}
