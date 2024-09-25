import java.util.Arrays;

public class AQA_1 {
    
    public static void main(String[] args) {

        printTreeWords();

        checkSumSing(5, -8);

        printColor(5);

        compareNumbers(1, 4);

        System.out.println(summFilter(5, 3));

        int roundNumber = (int) Math.ceil(6.74);
        numberCheck(roundNumber);

        System.out.println(reversCheck(roundNumber));

        cyclePrint("Написать этот текст осталось: ", 5);

        System.out.println(leapCheck(30));

        reversArray();

        emptyArray();

        editArray();

        mirrorTable();

        createArray(5, 9);
    }

    public static void printTreeWords() {
        System.out.println("Orange,\nBanana,\nApple.");
    }
    
    public static void checkSumSing(int a, int b) {
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
        } else if (a >= 1 && a <= 100){
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
        return (a + b >= 10 && a + b <= 20); 
    }

    public static void numberCheck(int a) {
        if (a >= 0) {
            System.out.println(a + " - Число положительное");
        } else {
            System.out.println(a + " - Число отрицительное");
        }
    }

    public static boolean reversCheck(int a) {
        return (a >= 0);
    }

    public static void cyclePrint(String a, int b) {
        for (int i = 1; i <= b; i++ ) {
            System.out.println(a + (b-i) + " раз");
        }
    }

    public static boolean leapCheck(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    public static void reversArray() {
        int[] binar = {1, 0, 1, 1, 1, 0, 1, 0};
        for(int i = 0; i < binar.length; i++ ) {
            if (binar[i] == 1) {
                binar[i] = 0;
            } else binar[i] = 1;
        }
        System.out.println(Arrays.toString(binar));
    }

    public static void emptyArray() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void editArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++ ) {
           if (arr[i] < 6) {
             arr[i] = arr[i]*2;
           }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void mirrorTable() {
        int[] [] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || 4 - i == j - 5) {
                    table[i] [j] = 1;
                } else table[i] [j] = 0;
                System.out.print(" " + table[i] [j] + " ");
            }
            System.out.println();
        }
    }

    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++ ){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}