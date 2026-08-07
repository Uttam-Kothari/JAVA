package lab5;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the arr size: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter arr elements:");
            a[i]=sc.nextInt();
        }
        A4 obj=new A4();
        obj.copy(a,size);   
    }  
    void copy(int[] a,int size){
        int[] b =new int[size];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        System.out.print("arry a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
         System.out.print("arry b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            System.out.print(" ");
        }
    }
}
