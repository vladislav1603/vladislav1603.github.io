package Задание1;

import java.util.ArrayList;
import java.util.List;

public class AQA_1 {
    private static List<Animals> animals = new ArrayList<>();
    private static FoodBowl foodBowl;

    public static void initializeAnimals() {
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
    }

    public static void setFoodBowl(double initialAmount) {
        foodBowl = new FoodBowl(initialAmount);
    }

    public static void fillBowl(double foodAmount) {
        foodBowl.fill(foodAmount);
    }

    public static void allEat() {
        System.out.println("Все животные едят...");
        double foodPerAnimal = foodBowl.getFoodAmount() / animals.size();
        for (Animals animal : animals) {
            animal.eat(foodPerAnimal);
            foodBowl.consume(foodPerAnimal); // Consume food from the bowl
        }
    }

    public static void displaySatietyStatus() {
        System.out.println("Статус сытости:");
        for (Animals animal : animals) {
            String type = animal instanceof Cat ? "Кошка" : "Собака";
            System.out.println(type + (animal.isSatiated() ? " наелась." : " не наелась."));
        }
    }

    public static int getTotalAnimalCount() {
        return animals.size(); // Returns the total count of animals in the list
    }

    public static int getCatCount() {
        return Cat.getCatCount();
    }

    public static int getDogCount() {
        return Dog.getDogCount();
    }
}
