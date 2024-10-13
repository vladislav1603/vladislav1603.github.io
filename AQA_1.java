public class AQA_1 {

    public static void validateArray(String[][] array) {

        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть пустым.");
        }
        
        if (array.length != 4) {
            throw new IllegalArgumentException("Длинна массива должна быть равна 4.");
        }
        
        for (String[] row : array) {
            if (row.length != 4) {
                throw new IllegalArgumentException("Высота массива должна быть равна 4.");
            }
        }
        
        System.out.println("Размер массива соответвует задным условиям.");
    }
}