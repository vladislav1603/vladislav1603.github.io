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

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        System.out.println("Размер массива соответвует заданым условиям.");
        System.out.println("Сумма всех элементов: " + sum);
    }
}