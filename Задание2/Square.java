package Задание2;

public class Square implements Shape {
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
    public String borderColor() {
        return "Красный";
    }
}
