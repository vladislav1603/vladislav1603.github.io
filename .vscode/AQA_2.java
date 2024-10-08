public class AQA_2{

    public interface Shape {
        double area();
        double perimeter();
    }

    public static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }

        @Override
        public double perimeter() {
            return 4 * side;
        }
    }

    public static class Triangle implements Shape {
        private double base;
        private double height;
        private double side1;
        private double side2;
        private double side3;

        public Triangle(double base, double height, double side1, double side2, double side3) {
            this.base = base;
            this.height = height;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        public double area() {
            return 0.5 * base * height;
        }

        @Override
        public double perimeter() {
            return side1 + side2 + side3;
        }
    }

    public static class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        @Override
        public double perimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Площадь круга: " + square.area());
        System.out.println("Периметр круга: " + square.perimeter());

        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " + triangle.perimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
    }
}