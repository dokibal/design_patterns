package creational.prototype;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.color = "Red";
        circle.radius = 5;

        shapes.add(circle);
        Circle newCircle = (Circle)circle.clone();
        shapes.add(newCircle);

        Rectangle rect = new Rectangle();
        rect.x = 20;
        rect.y = 20;
        rect.color = "Blue";
        rect.width = 40;
        rect.height = 50;

        shapes.add(rect);

        copyAndCompare(shapes, shapesCopy);

        BundledShapeCache cache = new BundledShapeCache();
        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Small blue rectangle");
        Shape shape3 = cache.get("Small blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Small blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Small blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Small blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }

    public static void copyAndCompare(ArrayList<Shape> shapes, ArrayList<Shape> shapesCopy){
        for(Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
