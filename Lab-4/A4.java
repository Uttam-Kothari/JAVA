import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        A4 obj=new A4();
        Scanner sc=new Scanner(System.in);
        System.out.println("ente the number: ");
        int n=sc.nextInt();
        int ans=obj.prime(n);
        if (ans==1) {
         System.out.println("number is prime");   
        }
    }
    int prime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return(0);
            }   
        }
        return(1);
    }
}
