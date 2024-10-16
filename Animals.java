abstract class Animals {
    public abstract void run(double distance);
    public abstract void swim(double distance);
    public abstract void eat(double foodAmount);
    public abstract boolean isSatiated();
}

class Cat extends Animals {
    private static final double maxRun = 200;
    private static int catCount = 0;
    private boolean isSatiated = false;
    private static final double minFood = 15;
    private static final double maxFood = 20;

    public Cat() {
        catCount++;
    }

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

    @Override
    public void eat(double foodAmount) {
        if (foodAmount < 0) {
            System.out.println("Количество еды не может быть меньше 0.");
            return;
        }
        double foodNeeded = Math.random() * (maxFood - minFood) + minFood;
        if (foodAmount >= foodNeeded) {
            isSatiated = true;
            System.out.println("Кошка наелась.");
        } else {
            System.out.println("Кошка не наелась. Не хватает еды.");
        }
    }

    @Override
    public boolean isSatiated() {
        return isSatiated;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Dog extends Animals {
    private static final double maxRun = 500;
    private static int dogCount = 0;
    private boolean isSatiated = false;
    private static final double minFood = 25;
    private static final double maxFood = 30;

    public Dog() {
        dogCount++;
    }

    @Override
    public void run(double distance) {
        if (distance > maxRun) {
            System.out.println("Собака может пробежать только " + maxRun + " метров.");
        } else {
            System.out.println("Собака пробежала " + distance + " метров.");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 10) {
            System.out.println("Собака может проплыть только 10 метров.");
        } else {
            System.out.println("Собака проплыла " + distance + " метров.");
        }
    }

    @Override
    public void eat(double foodAmount) {
        if (foodAmount < 0) {
            System.out.println("Количество еды не может быть ниже 0.");
            return;
        }
        double foodNeeded = Math.random() * (maxFood - minFood) + minFood;
        if (foodAmount >= foodNeeded) {
            isSatiated = true;
            System.out.println("Собака наелась.");
        } else {
            System.out.println("Собака не наелась. Не хватает еды.");
        }
    }

    @Override
    public boolean isSatiated() {
        return isSatiated;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
