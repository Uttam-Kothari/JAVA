
package lab8;

import java.util.Scanner;

class time {
    int hour;
    int min;
    int sec;

    time() {
    }

    time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    time addTime(time t1, time t2, time t3) {
        time t4 = new time();
        t4.hour = t1.hour + t2.hour + t3.hour;
        t4.min = t1.min + t2.min + t3.min;
        t4.sec = t1.sec + t2.sec + t3.sec;

        while (t4.sec >= 60) {
            t4.min += 1;
            t4.sec -= 60;
        }
        while (t4.min >= 60) {
            t4.hour += 1;
            t4.min -= 60;
        }
        return t4;
    }
}

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the hour: ");
        int h1 = sc.nextInt();
        System.out.print("enter the min: ");
        int m1 = sc.nextInt();
        System.out.print("enter the sec: ");
        int s1 = sc.nextInt();

        time t1 = new time(h1, m1, s1);

        System.out.print("enter the hour: ");
        int h2 = sc.nextInt();
        System.out.print("enter the min: ");
        int m2 = sc.nextInt();
        System.out.print("enter the sec: ");
        int s2 = sc.nextInt();

        time t2 = new time(h2, m2, s2);

        System.out.print("enter the hour: ");
        int h3 = sc.nextInt();
        System.out.print("enter the min: ");
        int m3 = sc.nextInt();
        System.out.print("enter the sec: ");
        int s3 = sc.nextInt();

        time t3 = new time(h3, m3, s3);

        time t4 = new time();
        t4 = t1.addTime(t1, t2, t3);
        System.out.println("Total time: " + t4.hour + ":" + t4.min + ":" + t4.sec);

    }

}
