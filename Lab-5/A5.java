package lab5;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the string: ");
        String a=sc.next();
        A5 obj=new A5();
        obj.string(a);  
}       
    void string(String a){
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
