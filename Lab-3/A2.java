package lab3;

import java.util.*;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter the value of a: ");
            int a = sc.nextInt();
            System.out.println("enter the value of b: ");
            int b = sc.nextInt();
            System.out.println("enter the value of function: ");
            char c = sc.next().charAt(0);
            if (c == '+') {
                System.out.println("a+b=" + (a + b));
            } else if (c == '-') {
                System.out.println("a-b=" + (a - b));
            } else if (c == '/') {
                if (b == 0) {
                    System.out.println("Input not valid");
                } else {
                    System.out.println("a/b=" + (a / b));
                }
            } else if (c == '*') {
                System.out.println("a*b=" + (a * b));
            } else if (c == '%') {
                System.out.println("a%b=" + (a % b));
            } else if (c == 'e') {
                return;
            }
        }
    }
}
