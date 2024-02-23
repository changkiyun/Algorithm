import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(bf.readLine());
        int acc = 0;
        int count = 0;

        for (int i=1; i<=inputNum; i++ ) {
            acc = 0;
            for(int j=i; j<=inputNum; j++) {
                acc += j;
                if(acc == inputNum) {
                    count++;
                    break;
                }else if (acc > inputNum) {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}