public class AQA_2{

    public interface Shape {
        double area();
        double perimeter();
        String backgroundColor();
        String borderСolor();
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

        @Override
        public String backgroundColor() {
            return "Зелёный";
        }

        @Override
        public String borderСolor() {
            return "Красный";
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

        @Override
        public String backgroundColor() {
            return "Желтый";
        }

        @Override
        public String borderСolor() {
            return "Желтый";
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

        @Override
        public String backgroundColor() {
            return "Зелёный";
        }

        @Override
        public String borderСolor() {
            return "Синий";
        }
    }

    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Фигура: круг; Площадь: " + square.area() + "; Периметр: " + square.perimeter() + "; Цвет фона: " + square.backgroundColor() + "; Цвет границ: " + square.borderСolor() + ";");

        System.out.println("Фигура: тругольник; Площадь: " + triangle.area() + "; Периметр: " + triangle.perimeter() + "; Цвет фона: " + triangle.backgroundColor() + "; Цвет границ: " + triangle.borderСolor() + ";");

        System.out.println("Фигура: прямоугольник; Площадь: " + rectangle.area() + "; Периметр: " + rectangle.perimeter() + "; Цвет фона: " + rectangle.backgroundColor() + "; Цвет границ: " + rectangle.borderСolor() + ";");
    }
}