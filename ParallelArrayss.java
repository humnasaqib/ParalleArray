import java.util.Arrays;
import java.util.Scanner;
public class ParallelArrayss {
    public static void main(String[] args) {


        int[] A1 = {4, 3, 6, 8, 0, 9};
        int[] A2 = {4, 3, 6, 8, 0, 9};


        if (A1.length == A2.length) {
            int[] sum =  new int[A1.length];
            int i = 0;




            for(int s1 : A1){
                sum[i++] = s1 + A2[i - 1];
            }

            System.out.println(Arrays.toString(sum));

            int[] T = new int[A1.length];
            for (int j =0; j < A1.length; j++){
                T[j] = A1[j] + A2[j];
            }

            System.out.println(Arrays.toString(T));


        } else {
            System.out.println("null");
        }




    }
}