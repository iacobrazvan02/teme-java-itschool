import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

        public class Main {
            public static void main(String[] args) {
                // Example task 1:
                Runnable helloWorld = () -> System.out.println("Hello, World!");
                helloWorld.run();

                // Example task 2:
                List<String> strings = Arrays.asList("apple", "banana", "cherry");
                List<String> upperCaseStrings = strings.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
                System.out.println(upperCaseStrings);
            }
        }