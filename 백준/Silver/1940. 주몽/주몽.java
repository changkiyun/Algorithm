import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] inputNum = new int[N];

        int start_pointer = inputNum[0];
        int end_pointer = inputNum[0];
        int sum=0;
        int count=0;


        for(int i=0; i<inputNum.length; i++) {
            inputNum[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            for(int j=i; j<N; j++) {
                if(i==j) continue;
                if(inputNum[i] + inputNum[j] == M) {
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}