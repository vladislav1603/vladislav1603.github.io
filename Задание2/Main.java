package Задание2;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Фигура: квадрат; Площадь: " + square.area() + "; Периметр: " + square.perimeter() + "; Цвет фона: " + square.backgroundColor() + "; Цвет границ: " + square.borderColor() + ";");

        System.out.println("Фигура: треугольник; Площадь: " + triangle.area() + "; Периметр: " + triangle.perimeter() + "; Цвет фона: " + triangle.backgroundColor() + "; Цвет границ: " + triangle.borderColor() + ";");

        System.out.println("Фигура: прямоугольник; Площадь: " + rectangle.area() + "; Периметр: " + rectangle.perimeter() + "; Цвет фона: " + rectangle.backgroundColor() + "; Цвет границ: " + rectangle.borderColor() + ";");
    }
}
