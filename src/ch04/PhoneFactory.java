package ch04;

public class PhoneFactory implements Factory {

    @Override
    public Apple createAppleProduct() {
        return new iPhone();
    }

    @Override
    public Huawei createHuaweiProduct() {
        return new Honor();
    }

}
