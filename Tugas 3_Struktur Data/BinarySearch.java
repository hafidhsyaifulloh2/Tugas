import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Data array (a1, a2, a3, a4, a5)
        int[]data = {10, 20, 35, 40, 50};

        //Arrays dari pengguna untuk angka yang dicari (n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka yang ingin dicari");
        int n = scanner.nextInt();

        //binary search
        int result =binarySearch(data,n);

        if (result != -1) {
            System.out.println("Angka " + n+ "ditemukann pada indeks ke-" +result);

        } else {
            System.out.println("Angka " + n+ "tidak ditemukan dalam data");
        } 

        scanner.close();
    }

    // Metode binary search

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while  (left <= right) {
            int mid = left + (right - left) /2;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
