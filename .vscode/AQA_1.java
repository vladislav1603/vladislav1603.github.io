abstract class Animals {
    public abstract void run(double distance);
    public abstract void swim(double distance);
}

class Cat extends Animals {
    private static final double maxRun = 200;

    @Override
    public void run(double distance) {
        if (distance > maxRun) {
            System.out.println("Кошка может пробежать только " + maxRun + " метров.");
        } else {
            System.out.println("Кошка пробежала " + distance + " метров.");
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println("Кошка не умеет плавать.");
    }
}

// Class Dog, inheriting from Animals
class Dog extends Animals {
    private static final double maxRun = 500; // Dog's maximum run distance
    private static final double maxSwim = 10; // Dog's maximum swim distance

    @Override
    public void run(double distance) {
        if (distance > maxRun) {
            System.out.println("Собака может пробежать только " + maxRun + " meters.");
        } else {
            System.out.println("Cобака пробежала " + distance + " метров.");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > maxSwim) {
            System.out.println("Собака может проплыть только " + maxSwim + " метров.");
        } else {
            System.out.println("Собака проплыла " + distance + " метров.");
        }
    }
}

// Main class for testing
public class AQA_1 {
    public static void main(String[] args) {
        Animals cat = new Cat();
        cat.run(100); 
        cat.swim(50); 

        Animals dog = new Dog();
        dog.run(150); 
        dog.swim(60); 
    }
}