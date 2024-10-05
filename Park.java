public class Park {
    public static class Attractions {
        private String name;
        private int workingHours;
        private double price;

        public Attractions(String name, int workingHours, double price) {

            this.name = name;
            this.workingHours = workingHours;
            this.price = price;

        }

        public String getName() {
            return name;
        }

        public int getTime() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }

    }

    public static void main(String[] args) {

        Park park = new Park();

        Park.Attractions carusel = new Park.Attractions("Карусель", 6, 35);
        Park.Attractions KolesoObozrenya = new Park.Attractions("Колесо Обозрения", 10, 60);

        System.out.println("Название: " + carusel.getName());
        System.out.println("Время работы: " + carusel.getTime() + " часов");
        System.out.println("Цена за билет: " + carusel.getPrice() + " рублей");
    }
}
