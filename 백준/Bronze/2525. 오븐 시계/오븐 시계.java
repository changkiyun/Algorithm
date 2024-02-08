import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minute, hour, time, extra;

        hour = s.nextInt();
        minute = s.nextInt();
        time = s.nextInt();
        extra = time / 60;
        time -= extra * 60;

        if(hour+extra >= 23 && minute+time > 59){
            hour = (hour+extra) - 23;
            minute = (minute+time) - 60;
        } else if (hour+extra > 23) {
            hour = (hour+extra) - 24;
            minute += time;
        } else if (minute+time > 59) {
            hour += extra+1;
            minute = (minute+time) - 60;
        } else {
            hour += extra;
            minute += time;
        }

        System.out.print(hour+ " " + minute);
    }
}