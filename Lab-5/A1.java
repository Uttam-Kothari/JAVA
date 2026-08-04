package lab5;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the arr size: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter arr elements:");
            a[i]=sc.nextInt();
        }
        A1 obj=new A1();
        int sum=obj.suma(a);
        System.out.println("sum="+(sum));
    } 
    int suma(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
