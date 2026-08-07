package lab5;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the arr size: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter arr elements:");
            a[i]=sc.nextInt();
        }
        A2 obj=new A2();
        double avg=obj.avga(a);
        System.out.println("arr avg="+(avg));
    } 
    double avga(int[] a){
        int sum=0,avg;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        avg=sum/a.length;
        return avg;
    }
}
