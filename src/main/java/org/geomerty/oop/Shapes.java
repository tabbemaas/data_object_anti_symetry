package org.geomerty.oop;

public class Shapes {
    public static class Point {
        private double x;
        private double y;

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Circle {
        private Point center;
        private double radius;

        public Point getCenter() {
            return center;
        }

        public double getRadius() {
            return radius;
        }

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public void area() {
            System.out.println("the area of this circle is " + Math.PI*Math.pow(this.radius, 2));
        }
    }

    public static class Rectangle {
        private Point topLeft;
        private double height;
        private double width;
        private String shape;

        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public Point getTopLeft() {
            return topLeft;
        }

        public Rectangle(Point topLeft, double height, double width) {
            this.topLeft = topLeft;
            this.height = height;
            this.width = width;
            this.shape = "rectangle";
        }

        public void area() {
            System.out.println("The area of this " + this.shape + " is " + this.getHeight()*this.getWidth());
        }
    }

    public static class Square extends Rectangle{
        private Point topLeft;
        private double side;

        public double getSide() {
            return side;
        }

        public Square(Point topLeft, double side) {
            super(topLeft, side, side);
            this.setShape("square");
        }
    }
}
