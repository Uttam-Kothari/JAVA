import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        A5 obj = new A5();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year: ");
        int y = sc.nextInt();
        int ans = obj.leep(y);
        if (ans == 0) {
            System.out.println("this is leep year");
        }
    }

    int leep(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return (0);
        } else {
            return (1);
        }
    }
}
