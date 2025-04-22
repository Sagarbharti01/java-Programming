import java.util.Arrays;

public class IntervalMerger {
    public static int mergeOverlap(int[][] arr) {
        if (arr == null || arr.length == 0) return 0;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int index = 0; // Points to the position to place the merged interval

        for (int i = 1; i < arr.length; i++) {
            if (arr[index][1] >= arr[i][0]) { // Overlapping
                arr[index][1] = Math.max(arr[index][1], arr[i][1]);
            } else {
                index++;
                arr[index] = arr[i]; // Move non-overlapping interval forward
            }
        }

        return index + 1; // Size of the merged array
    }

    public static void main(String[] args) {
        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};

        int newSize = mergeOverlap(arr);

        System.out.println("Merged Intervals:");
        for (int i = 0; i < newSize; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
