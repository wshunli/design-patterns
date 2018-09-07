package ch02;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Point 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("POINT");
        //调用 Point 的 draw 方法
        shape1.draw();
        //获取 Line 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("LINE");
        //调用 Line 的 draw 方法
        shape2.draw();
        //获取 Plane 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("PLANE");
        //调用 Plane 的 draw 方法
        shape3.draw();
    }

}
