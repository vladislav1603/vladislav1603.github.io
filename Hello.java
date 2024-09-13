public class Hello {
    
    public static void main(String[] args) {

        System.out.println("Orange,\nBanana,\nApple");

        int c = checkSomeSing(5, -8);
        if(c >= 0) {
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }

        int d = printColor(c);

        if(d <= 0){
            System.out.println("Красный");
        }else if (d > 1 && d <= 100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зелёный");
        };

    }
    
    public static int checkSomeSing(int a, int b) {
        return a + b;
    }

    public static int printColor(int a){
        return (a = -3);
    }
}