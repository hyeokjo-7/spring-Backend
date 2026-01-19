package Haed20_.Generic;

public class Rectangle implements Shape {
    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getArea() {
        return width * heigth;
    }
}

