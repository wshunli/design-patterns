package ch09;

public class ConcreteComponent implements Component {
    @Override
    public void sampleOperation() {
        System.out.println("ConcreteComponent.sampleOperation()");
    }
}
