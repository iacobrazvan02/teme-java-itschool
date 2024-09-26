public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
