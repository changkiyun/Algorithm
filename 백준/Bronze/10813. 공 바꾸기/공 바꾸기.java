import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        int[] basket = new int[N];

        for(int i=0; i<N; i++) {
            basket[i] = i+1;
        }

        for(int i=0; i<M; i++) {
            int j = s.nextInt();
            int k = s.nextInt();
            int trans;

            trans = basket[j-1];
            basket[j-1] = basket[k-1];
            basket[k-1] = trans;
        }

        for(int i : basket) {
            System.out.print(i + " ");
        }
    }
}