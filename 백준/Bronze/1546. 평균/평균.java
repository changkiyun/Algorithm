import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int M = s.nextInt();
        double max = 0;
        double avg = 0;

        double[] score = new double[M];

        for(int i=0; i<M; i++) {
            score[i] = s.nextInt();
            if(score[i] > max) {
                max = score[i];
            }
        }

        for(int i=0; i<M; i++) {
            score[i] = score[i]/max*100;
            avg += score[i];
        }

        System.out.println(avg/M);




    }
}