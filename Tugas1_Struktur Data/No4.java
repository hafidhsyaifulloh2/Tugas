import java.util.Arrays;
public class No4 {
    public static void main(String[] args) {
        String [][] alfabet = {
            {"p","s","n"},
            {"w","l","b"},
            {"f","r","e"},   
        };
        System.out.println("\n" +"Array Dua Dimensi: \n");
        for (String []num : alfabet) {
            System.out.println(Arrays.toString(num));
        };
    }
}
