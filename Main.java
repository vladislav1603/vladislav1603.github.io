public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {
            "Яблоко", "Банан", "Апепльсин", "Яблоко", "Банан",
            "Киви", "Апепльсин", "Киви", "Яблоко", "Банан", 
            "Киви", "Грейпфрукт", "Банан", "grape"
        };

        AQA_1 wordCounter = new AQA_1();

        wordCounter.countWords(wordsArray);

        wordCounter.displayWordCounts();
    }
}