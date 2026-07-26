import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        A2 obj=new A2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        Integer n=sc.nextInt();
        obj.oddeven(n);
    }
    void oddeven(Integer n){
        if (n%2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("number is odd");
        }
    }    
}
