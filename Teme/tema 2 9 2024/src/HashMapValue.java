import java.util.HashMap;

public class HashMapValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        printValueForB(map);
    }

    public static void printValueForB(HashMap<String, Integer> map) {
        if (map.containsKey("B")) {
            System.out.println("Value for key 'B': " + map.get("B"));
        } else {
            System.out.println("Key 'B' not found.");
        }
    }
}
