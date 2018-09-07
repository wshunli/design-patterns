package ch05;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();


    @Override
    public void name(String name) {
        product.setName(name);
    }

    @Override
    public void type(String type) {
        product.setType(type);
    }

    @Override
    public void size(String size) {
        product.setSize(size);
    }

    public Product build() {
        return product;
    }
}
