package ch10;

public class ProxyMain {
    public static void main(String[] args) {

        AbstractObject object = new ProxyObject();
        object.operation();

    }
}
