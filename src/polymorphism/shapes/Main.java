package polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        int totalArea = 0, totalPerimeter = 0;

        for (int i = 0; i < shapes.size(); i++) {
            totalArea += shapes.get(i).getArea();
            totalPerimeter += shapes.get(i).getPerimeter();
        }

        System.out.println(totalArea);
        System.out.println(totalPerimeter);
    }
}
