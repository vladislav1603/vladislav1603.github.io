public class Hello {
    
    public static void main(String[] args) {

        System.out.println("Orange,\nBanana,\nApple");

        checkSomeSing(5, -8);

        printColor(5);

        compareNumbers(1, 4);

        System.out.println(summFilter(5, 7));

        int roundNumber = (int) Math.ceil(6.74);
        numberCheck(roundNumber);

        System.out.println(reversCheck(roundNumber));

        cyclePrint("Написать этот текст осталось: ", 5);

        System.out.println(leapCheck(30));

        reversArray();

    }
    
    public static void checkSomeSing(int a, int b) {
        int c = a + b;
        if(c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int a) {
        if(a <= 0) {
            System.out.println("Красный");
        } else if (a > 1 && a <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        };
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean summFilter(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberCheck(int a) {
        if (a >= 0) {
            System.out.println(a + " - Число положительное");
        } else {
            System.out.println(a + " - Число отрицительное");
        }
    }

    public static boolean reversCheck(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void cyclePrint(String a, int b) {
        for (int i = 1; i <= b; i++ ) {
            System.out.println(a + (b-i) + " раз");
        }
    }

    public static boolean leapCheck(int a) {
        if (a < 100 && a % 4 == 0) {
            return true;
        } else if (a > 100 && a % 100 == 0 && a % 400 == 0) {
            return true;
        } else if (a > 100 && a % 100 != 0 && a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void reversArray() {
        int[] binar = {1, 0, 1, 1, 1, 0, 1, 0};
        for(int i = 0; i < binar.length; i++ ) {
            if (binar[i] == 1) {
                binar[i] = 0;
            } else binar[i] = 1;
            System.out.println(binar[i]);
        }
    }
}