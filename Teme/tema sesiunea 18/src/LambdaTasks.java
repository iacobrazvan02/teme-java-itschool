import java.util.*;
import java.util.function.*;
import java.util.Comparator;

public class LambdaTasks {
    public static void main(String[] args) {
        // 1.
        Runnable helloWorld = () -> System.out.println("Hello, World!");
        helloWorld.run();

        // 2.
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        strings.sort(lengthComparator);
        System.out.println("Strings sorted by length: " + strings);

        // 3.
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'apple': " + stringLength.apply("apple"));

        // 4.
        BiPredicate<String, String> isFirstLonger = (s1, s2) -> s1.length() > s2.length();
        System.out.println("Is 'banana' longer than 'apple'? " + isFirstLonger.test("banana", "apple"));

        // 5.
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // 6.
        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println("Sum of 5 and 3: " + add.apply(5, 3));

        // 7.
        strings.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Strings sorted in reverse alphabetical order: " + strings);
    }
}
