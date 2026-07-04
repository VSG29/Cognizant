import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}