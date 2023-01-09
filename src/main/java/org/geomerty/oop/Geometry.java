package org.geomerty.oop;

public class Geometry {

    public static void main(String[] args) {
        // TODO Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.0
        Shapes.Square a = new Shapes.Square(new Shapes.Point(2.5, 4.5), 3.0);
        a.area();
        // TODO Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0;
        Shapes.Rectangle b = new Shapes.Rectangle(new Shapes.Point(10.0, 5.0), 4.0, 5.0);
        b.area();
        // TODO Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3;
        Shapes.Circle c = new Shapes.Circle(new Shapes.Point(8.7, 4.0), 6.3);
        c.area();
    }
}
