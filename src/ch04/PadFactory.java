package ch04;

public class PadFactory implements Factory {

    @Override
    public Apple createAppleProduct() {
        return new iPad();
    }

    @Override
    public Huawei createHuaweiProduct() {
        return new HuaweiPad();
    }

}
