package ch04;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        Factory factory = new PhoneFactory();
        Apple apple = factory.createAppleProduct();
        apple.AppleStyle();
        Huawei huawei = factory.createHuaweiProduct();
        huawei.HuaweiStyle();

        factory = new PadFactory();
        apple = factory.createAppleProduct();
        apple.AppleStyle();
        huawei = factory.createHuaweiProduct();
        huawei.HuaweiStyle();

    }
}
