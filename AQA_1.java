import java.util.ArrayList;
import java.util.List;

public class AQA_1 {
    private static List<Animals> animals = new ArrayList<>();
    private static double foodBowl = 10;

    public static void initializeAnimals() {
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
    }

    public static void fillBowl(double foodAmount) {
        foodBowl += foodAmount;
        System.out.println("Чаша для еды наполнена. Текущее количество еды: " + foodBowl);
    }

    public static void allEat() {
        System.out.println("Все животные едят...");
        for (Animals animal : animals) {
            animal.eat(foodBowl / animals.size());
        }
    }

    public static void displaySatietyStatus() {
        System.out.println("Статус сытости:");
        for (Animals animal : animals) {
            String type = animal instanceof Cat ? "Кошка" : "Собака";
            System.out.println(type + (animal.isSatiated() ? " наелась." : " не наелась."));
        }
    }

    public static int getCatCount() {
        return Cat.getCatCount();
    }

    public static int getDogCount() {
        return Dog.getDogCount();
    }
}
