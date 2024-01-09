import java.io.*;
import java.util.*;

public class subarray {

    public static void main(String[] args) {

        int[] arr = { 1, -2, 4, -5, 1 };

        System.out.println(Arrays.toString(arr));
        System.out.println();

        // int limit = 0;
        // int k = 0;
        for (int z = 0; z < arr.length; z++) {
            int limit = 0;
            // int ilk = 0;

            for (int i = 0; i < arr.length; i++) {
                int k = 0;

                for (int j = 0; j < arr.length - limit; j++) {
                    System.out.print(arr[j] + " ");

                }
                limit++;
                System.out.println("\n");
            }
        }
    }
}
