import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, int time, double price) {
        Attraction attraction = new Attraction(name, time, price);
        attractions.add(attraction);
    }

    // Метод для получения информации об аттракционах
    public void displayAttractions() {
        System.out.println("Аттракционы в парке:" + name + "-");
        if (attractions.isEmpty()) {
            System.out.println("Нету аттракционов.");
        } else {
            for (Attraction attraction : attractions) {
                System.out.println(attraction);
            }
        }
    }
    private class Attraction {
        private String name;
        private int time;
        private double price;

        public Attraction(String name, int time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + time + " часов, Цена за билет: " + price + " рублей;";
        }
    }
}