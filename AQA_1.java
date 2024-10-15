import java.util.HashMap;
import java.util.Map;

public class AQA_1 {
    private Map<String, Integer> wordCountMap;

    public AQA_1() {
        wordCountMap = new HashMap<>();
    }

    public void countWords(String[] wordsArray) {
        for (String word : wordsArray) {

            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }

    public void displayWordCounts() {
        System.out.println("Уникальные слова в массиве:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}