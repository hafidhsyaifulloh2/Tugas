public class Mergesort {
    public static void mergesort (int[] arr ) {
        if (arr == null || arr.length < 2) {
            return;
        }

        sort(arr,0, arr.length -1);

    }

    private static void sort (int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) /2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[]arr, int left, int mid, int right) {
        int n1 = mid -left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }

        for (int j =0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i <n1 && j <n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++; 
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L [i];
            i++;
            k++;

        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
    public static void main(String[] args) {
        int nilai1 = 1;
        int nilai2 = 2;
        int nilai3 = 7;
        int nilai4 = 9;
        int nilai5 = 4;
        int nilai6 = 3;

        int[] arr = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};

        System.out.println("Array sebelum di urukan:");
        for(int num :arr) {
            System.out.print(num +" ");
        }

        mergesort(arr);

        System.out.println("\nArray sesudah diurutkan");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}