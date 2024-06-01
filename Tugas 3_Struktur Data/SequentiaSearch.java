import java.util.Scanner;


public class SequentiaSearch {
    public static void main(String[] args) {
        //data array (a1, a2, a3, a4, a5)
        int[] data = {15, 20, 30, 45, 50,};

        //input dari pengguna untuk angka yang dicari (n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka yang ingin dicari : ");
        int n = scanner.nextInt();

        //sequential search
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == n) {
                found = true;
                System.out.println("Angka " + n+ "di temukan pada indeks ke-" + 1 );
                break;
            }
        }

        if (!found) {
            System.out.println("Angka " + n + "tidak ditemukkan dalam data .");
        }

        scanner.close();
    }

    
}
