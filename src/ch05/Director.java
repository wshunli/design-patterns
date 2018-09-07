package ch05;

public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.name("Burger");
        builder.type("Wrapper");
        builder.size("big");
        return builder.build();
    }

    public Product getBProduct() {
        builder.name("Coke");
        builder.type("Bottle");
        builder.size("small");
        return builder.build();
    }


}
