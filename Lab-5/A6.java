package lab5;

import java.util.Scanner;

public class A6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the length= ");
    int n = sc.nextInt();
    A6 obj = new A6();
    obj.pattern(n);
  }

  void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }
  }
}
