import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomework {   //1
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Colors: " + colors);

        for (String color : colors) {    //2
            System.out.println(color);
        }

        colors.add(0, "Yellow");   //3
        System.out.println("After inserting at the first position: " + colors);

        colors.remove(2);  // Index starts from 0    //4
        System.out.println("After removing the third element: " + colors);

        String searchColor = "Green";   //5
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is in the list.");
        } else {
            System.out.println(searchColor + " is not in the list.");
        }

        Collections.sort(colors);   //6
        System.out.println("Sorted colors: " + colors);

        Collections.swap(colors, 0, 1);   //7
        System.out.println("After swapping: " + colors);


        ArrayList<String> moreColors = new ArrayList<>();  //8
        moreColors.add("Purple");
        moreColors.add("Orange");
        colors.addAll(moreColors);
        System.out.println("After joining two lists: " + colors);


        ArrayList<String> clonedList = (ArrayList<String>) colors.clone();  //9
        System.out.println("Cloned list: " + clonedList);


        Collections.reverse(colors); //10
        System.out.println("Reversed list: " + colors);


        ArrayList<String> subList = new ArrayList<>(colors.subList(1, 3)); //11
        System.out.println("Extracted portion: " + subList);


        ArrayList<String> comparisonList = new ArrayList<>(colors);  //12
        boolean areEqual = colors.equals(comparisonList);
        System.out.println("Are the two lists equal? " + areEqual);


    }

}