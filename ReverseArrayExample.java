import java.util.Arrays;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverseArray(arr, arr.length);
    }

    public static void reverseArray(int[] arr, int length) {
        int[] newArray = new int[length]; // step 1
        int j = length; // step 2
        for (int i = 0; i < length; i++) {
            newArray[j - 1] = arr[i];
            j--;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
