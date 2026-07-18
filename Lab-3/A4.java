package lab3;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temputer in feranhit: ");
        Float f=sc.nextFloat();
        System.out.println("temp in c="+((f-32)*5/9));
        System.out.println("enter the tem c: ");
        Float c=sc.nextFloat();
        System.out.println("temp in f="+(c*5/9)+32);

    }
    
}
