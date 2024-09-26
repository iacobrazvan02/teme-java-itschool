public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                decreasing = false;
            }
            if (array[i] < array[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3};
        System.out.println("Array-ul este monotonic? " + isMonotonic(array));
    }
}
