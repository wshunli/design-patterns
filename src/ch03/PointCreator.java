package ch03;

public class PointCreator implements ICreator {
    @Override
    public Shape getShape() {
        return new Point();
    }
}
