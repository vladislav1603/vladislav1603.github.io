package Задание2;

public interface Shape {
    double area();
    double perimeter();

    default String backgroundColor() {
        return "Белый"; // Default background color
    }

    default String borderColor() {
        return "Чёрный"; // Default border color
    }
}
