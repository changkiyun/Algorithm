import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String sNum = s.next();

        char[] cNum = sNum.toCharArray();

        int sum=0;

        for (int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.print(sum);
    }
}