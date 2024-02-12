import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int a=1;
        int b=1;
        String str;

        while( (str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a+b + "\n");
        }
        bw.close();
    }
}