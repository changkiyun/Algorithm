import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        int i,j,k;

        int[] basket = new int[N];

        for(int m=0; m<M; m++) {
            i = s.nextInt()-1;
            j = s.nextInt()-1;
            k = s.nextInt();

            for(int n=i; n<=j; n++){
                basket[n] = k;
            }
        }

        for (int m : basket) {
            System.out.print(m + " ");
        }
    }
}