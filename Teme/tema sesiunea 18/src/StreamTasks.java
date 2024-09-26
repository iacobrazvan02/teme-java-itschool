import java.util.*;
import java.util.stream.*;

public class StreamTasks {
    public static void main(String[] args) {
        // 1.
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + upperCaseStrings);

        // 2.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> oddSquares = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Odd squares: " + oddSquares);

        // 3.
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max value: " + value));

        // 4.
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of numbers: " + sum);

        // 5.
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
