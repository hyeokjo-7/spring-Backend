package Haed20_.Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardConsumerExample {
    public static void addDefaultShapes(List<? super Shape> list) {
        list.add(new Circle(1.0));
        list.add(new Rectangle(2.0, 5.0));
        Object obj = list.get(0);
    }

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        addDefaultShapes(objects);

        for (Object o : objects) {
            if (o instanceof Circle circle) {
                System.out.println("circle.getArea() :" + circle.getArea());
            }
            if (o instanceof Rectangle rectangle) {
                System.out.println("rectangle.getArea() :" + rectangle.getArea());
            }
        }
    }
}
