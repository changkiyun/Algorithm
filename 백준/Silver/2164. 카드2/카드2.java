import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cardNum = Integer.parseInt(bf.readLine());

        Queue<Integer> cardQue = new LinkedList<>();

        for (int i = 1; i <= cardNum; i++) {
            cardQue.add(i);
        }

        while (cardQue.size() > 1) {
            cardQue.poll();
            cardQue.add(cardQue.poll());
        }
        System.out.println(cardQue.poll());


    }

}