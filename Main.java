public class Main {

    public static void main(String[] args) {
        String[][] validArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
            {"1", "2"},
            {"3", "a"},
            {"4", "5"},
            {"6", "7"}
        };

        AQA_1.validateArray(validArray);  
        AQA_1.validateArray(invalidArray); 
    }
}