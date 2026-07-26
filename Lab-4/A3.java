import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        A3 obj=new A3();
        obj.max();
    }
    void max(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three number: ");
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        Integer c=sc.nextInt();
        System.out.println("max="+((a>b)?((a>c)?a:c):((b>c)?b:c)));
    }
}
