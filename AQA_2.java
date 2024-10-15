import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AQA_2 {
    private Map<String, List<String>> directory;

    public AQA_2() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        directory.putIfAbsent(lastName, new ArrayList<>());
        directory.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }

}