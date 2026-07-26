import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        A1 obj=new A1();
        obj.getdivision();
    }
    void getdivision(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five subject marks(out of 100): ");
        Float F1=sc.nextFloat();
        Float F2=sc.nextFloat();
        Float F3=sc.nextFloat();
        Float F4=sc.nextFloat();
        Float F5=sc.nextFloat();
        Float sum=F1+F2+F3+F4+F5;
        Float per=sum/5;
        if (per>=60) {
            System.out.println("First Division");
        }else if (per>=50) {
            System.out.println("Second Division");
        }else if (per>=40) {
             System.out.println("Third Division");
        }else{
             System.out.println("Fail");
        }
    }    
}
