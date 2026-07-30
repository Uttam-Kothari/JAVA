import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        A6 obj = new A6();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int ans = obj.pali(n);
        if (ans == 0) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    int pali(int n) {
        int b = 0, temp = n;
        while (n != 0) {
            int a = n % 10;
            b = b * 10 + a;
            n = n / 10;

        }
        if (temp == b) {
            return (0);
        } else {
            return (1);
        }
    }
}
