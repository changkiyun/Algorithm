import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNum = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());

        long[] S = new long[suNum+1];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i=1; i<=suNum; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }


        for (int k=0; k<quizNum; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(S[j]-S[i-1]);
        }
    }
}