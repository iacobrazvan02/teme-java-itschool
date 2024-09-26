import java.util.List;

public class ListContains {
    public static void main(String[] args) {
        List<String> animals = List.of("cat", "dog", "bird");

        checkForDog(animals);
    }

    public static void checkForDog(List<String> list) {
        if (list.contains("dog")) {
            System.out.println("The list contains 'dog'.");
        } else {
            System.out.println("The list does not contain 'dog'.");
        }
    }
}

