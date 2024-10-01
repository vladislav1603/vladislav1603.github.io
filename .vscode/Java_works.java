public class Java_works {
    public static void main(String[] args) {
       Arr(args);
       Sum(args);
    }

    public static void Arr(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void Sum(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);
    }
}