public class AQA_1 {

    public static void validateArray(String[][] array) {

        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        
        if (array.length != 4) {
            throw new IllegalArgumentException("Input array must have 4 rows.");
        }
        
        for (String[] row : array) {
            if (row.length != 4) {
                throw new IllegalArgumentException("Each row in the input array must have 4 columns.");
            }
        }
        
        System.out.println("Valid 4x4 array.");
    }
}