package ch03;

public class LineCreator implements ICreator {
    @Override
    public Shape getShape() {
        return new Line();
    }
}
