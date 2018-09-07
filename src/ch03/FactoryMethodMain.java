package ch03;

public class FactoryMethodMain {
    public static void main(String[] args) {

        ICreator creator = new PointCreator();
        Shape shape = creator.getShape();
        shape.draw();

        creator = new LineCreator();
        shape = creator.getShape();
        shape.draw();

        creator = new PlaneCreator();
        shape = creator.getShape();
        shape.draw();

    }
}
