import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int caseNum = s.nextInt();
        int a,b;

        for(int i=0; i<caseNum; i++){
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a+b);
        }
    }
}