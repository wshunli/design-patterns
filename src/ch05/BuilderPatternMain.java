package ch05;

public class BuilderPatternMain {
    public static void main(String[] args) {

        Director director = new Director();
        Product aProduct = director.getAProduct();
        aProduct.show();

        Product bProduct = director.getBProduct();
        bProduct.show();
    }
}
