import java.util.Arrays;

public class Counting {
    public static void CountingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min +1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int i : arr) {
            count[i -min]++;
        }

        for(int i = 1; i < range; i++) {
            count[i] += count[i -1];
        }

        for (int i = arr.length -1; i >= 0; i--) {
            output[count[arr[i] -min]-1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int nilai1 = 4;
        int nilai2 = 7;
        int nilai3 = 19;
        int nilai4 = 5;
        int nilai5 = 23;
        int nilai6 = 10;

        int[] arr = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        System.out.println("Arrays sebelum diurutkan");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        CountingSort(arr); {

            System.out.println("\nArrays setelah diurutkan");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
