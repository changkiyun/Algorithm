import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int N = s.nextInt();

        int total=0;
        int price=0;
        int productNum=0;

        for (int i=0; i<N; i++){
            price = s.nextInt();
            productNum = s.nextInt();
            total += price*productNum;
        }

        if(total == X){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }
}