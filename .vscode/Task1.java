public class Task1 {
    public static void main(String[] args) {
        int n = 50;
        double[] array = new double[n];
        for(int i = 0; i < array.length; i ++){
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for(int i = 0; i < array.length; i ++){
            if(max < array[i]);{
                max = array[i];
            } 
            if (min > array[i]){
                min = array[i];
            }
            avg += array[i]/array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
        for (int i = 2; i <= array.length; i ++) {
            boolean isPrime = true;

            for (int j = 2; j < i; i++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
