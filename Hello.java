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
    }
    
    public static void checkSomeSing(int a, int b) {
        int c = a + b;
        if(c >= 0) {
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int a){
        if(a <= 0){
            System.out.println("Красный");
        }else if (a > 1 && a <= 100){
            System.out.println("Желтый");
        }else {
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

    public static boolean summFilter(int a, int b)
    {
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
}