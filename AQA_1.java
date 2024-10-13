public class AQA_1 {

    public static void validateArray(String[][] array) {
        if (array == null) {
            System.err.println("Массив не может быть пустым.");
            return;
        }

        if (array.length != 4) {
            System.err.println("Длинна массива должна быть равна 4.");
            return;
        }

        for (String[] row : array) {
            if (row.length != 4) {
                System.err.println("Высота массива должна быть равна 4.");
                return;
            }
        }

        int sum = 0;
        boolean validData = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    validData = false;
                }
            }
        }

        if (validData) {
            System.out.println("Размер массива соответвует заданым условиям.");
            System.out.println("Сумма всех элементов: " + sum);
        } else {
            System.out.println("Некоторые данные в массиве были недействительными.");
        }
    }
}