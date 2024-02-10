import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        int[] input = {a, b, c};

        int money=0;

        if(b == c && c == a){
            money = 10000+a*1000;
        }else if(a==b || a==c || b==c) {
            if(a==b){
                money = 1000+a*100;
            } else if (a==c) {
                money = 1000+a*100;
            } else if (b==c) {
                money = 1000+b*100;
            }
        }else {
            int max =0;
            for (int i : input){
                if(i > max){
                    max = i;
                }
            }
            money = max*100;
        }

        System.out.println(money);
    }
}