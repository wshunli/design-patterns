package ch03;

public class PlaneCreator implements ICreator {
    @Override
    public Shape getShape() {
        return new Plane();
    }
}
