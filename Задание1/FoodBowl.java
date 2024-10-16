package Задание1;

public class FoodBowl {
    private double foodAmount;

    public FoodBowl(double initialAmount) {
        this.foodAmount = initialAmount;
    }

    public void fill(double amount) {
        foodAmount += amount;
        System.out.println("Чаша для еды наполнена. Текущее количество еды: " + foodAmount);
    }

    public double getFoodAmount() {
        return foodAmount;
    }

    public void consume(double amount) {
        foodAmount -= amount;
    }
}
