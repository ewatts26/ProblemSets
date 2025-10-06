import java.util.*;

public class ProblemSet0 {
    public static void main(String[] args) {
        // test for countInRange
        int[] arr1 = {14, 1, 22, 17, 36, 7 -43, 5};
        System.out.println(countInRange(arr1, 4, 17));

        // test for clump
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("hi", "there", "what", "is", "up?"));
        System.out.println(clump(arr2));

        // test for isMagicSquare
        int[][] arr3 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        System.out.println(isMagicSquare(arr3));

        // test for median
        int[] arr4 = {2, 3, 10, 1, 5};
        System.out.println(Arrays.toString(arr4));
    }
    
    public static int countInRange(int[] arr, int min, int max) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= min) && (arr[i] <= max)) {
                total += 1;
            }
        }
        return total;
    }
    
    public static ArrayList<String> clump(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (i == list.size() - 1) {
                return list;
            }
            String clumped = ("(" + list.get(i) + " " + list.get(i + 1) + ")");
            list.set(i, clumped);
            list.remove(i + 1);
        }
        return list;
    }
    public static boolean isMagicSquare(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[0][i];
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                count += arr[i][j];
            }
            if (count != total) {
                return false;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr[j].length; i++) {
                count += arr[i][j];
            }
            if (count != total) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i][i];
        }
        if (count != total) {
            return false;
        }
        return true;
    }
    public static int median(int[] arr) {
        int length = arr.length / 2;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            if (count == length) {
                return arr[i];
            }
        }
        return -1;
    }
}
