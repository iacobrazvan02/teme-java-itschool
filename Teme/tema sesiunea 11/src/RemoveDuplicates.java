import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        Set<Character> chars = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (chars.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "caractereduplicate";
        System.out.println("String fără duplicate: " + removeDuplicates(input));
    }
}
