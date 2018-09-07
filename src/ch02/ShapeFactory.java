package ch02;

public class ShapeFactory {

    // 使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("POINT")) {
            return new Point();
        } else if (shapeType.equalsIgnoreCase("LINE")) {
            return new Line();
        } else if (shapeType.equalsIgnoreCase("PLANE")) {
            return new Plane();
        }
        return null;
    }

}
