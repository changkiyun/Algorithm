import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int level = s.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(level + " * " + i + " = " + (level*i));
        }
    }
}