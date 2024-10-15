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

        AQA_2 td = new AQA_2();
        
        td.add("Смит", "123-456-7890");
        td.add("Смит", "098-765-4321");
        td.add("Джонсон", "555-123-4567");

        System.out.println("Поиск по фамилии `Смит`: " + td.get("Смит"));
        System.out.println("Поиск по фамилии `Джонсон`: " + td.get("Джонсон"));
        System.out.println("Поиск по фамилии `Дон`: " + td.get("Дон"));
    }
}