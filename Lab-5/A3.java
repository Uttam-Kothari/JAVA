package lab5;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the arr size: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter arr elements:");
            a[i]=sc.nextInt();
        }
        A3 obj=new A3();
        obj.revers(a);
}
        void revers(int[] a){
            for (int i = 0; i < a.length/2; i++) {
                int temp=a[i];
                a[i]=a[a.length-i-1];
                a[a.length-i-1]=temp;    
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print("arr element["+i+"]="+a[i]);
            }
            System.out.println();


        }
}
