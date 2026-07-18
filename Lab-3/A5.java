package lab3;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter b: ");
        int b=sc.nextInt();
        System.out.println("enter c: ");
        int c=sc.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println("largest num="+a);
            }else{
                System.out.println("largest num="+c);
            }
        }else  {
            if (b>c) {
                System.out.println("largest num="+b);
            }else{
                System.out.println("largest num="+c);
            }
            
        }
    }
}
