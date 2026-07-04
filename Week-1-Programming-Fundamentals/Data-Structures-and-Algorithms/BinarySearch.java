import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {30, 10, 50, 20, 40};

        Arrays.sort(arr);

        int key = 40;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {

                System.out.println("Found at index " + mid);
                return;
            }

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Not Found");
    }
}