import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruits));

        System.out.println(fruitList);
    }
}

