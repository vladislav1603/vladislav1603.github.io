public class Main {
    public static void main(String[] args) {
        AQA_1.initializeAnimals();

        AQA_1.fillBowl(50);
        AQA_1.allEat();
        AQA_1.displaySatietyStatus();

        System.out.println("Количество кошек: " + AQA_1.getCatCount());
        System.out.println("Количество собак: " + AQA_1.getDogCount());
    }
}
