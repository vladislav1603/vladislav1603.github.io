public class Main {

    public static void main(String[] args) {

        String[][] validArray = {
            {"a", "b", "c", "d"},
            {"e", "f", "g", "h"},
            {"i", "j", "k", "l"},
            {"m", "n", "o", "p"}
        };

        String[][] invalidArray = {
            {"a", "b"},
            {"c", "d"},
        };

        try {
            ArrayValidator.validateArray(validArray);  
            ArrayValidator.validateArray(invalidArray); 
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}