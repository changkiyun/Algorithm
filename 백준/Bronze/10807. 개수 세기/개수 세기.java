import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int count=0;
        int v;
        int T = s.nextInt();
        int[] a = new int[T];

        for(int i=0; i<T; i++) {
            a[i] = s.nextInt();
        }

        v = s.nextInt();

        for(int i=0; i<a.length; i++) {
            if(a[i] == v){
                count++;
            }
        }

        System.out.println(count);

    }
}