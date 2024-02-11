import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i=1; i<=T; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println("Case #" + i + ": " + (a+b));
        }

    }
}