import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        A7 obj = new A7();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three bit number renge: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        obj.prime(n1, n2);
    }

    void prime(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            int m = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    m++;
                }
            }
            if (m == 0) {
                System.out.print(+i +" ");
            }
        }
    }
}
