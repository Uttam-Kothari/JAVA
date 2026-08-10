package lab7;

import java.util.Scanner;

class arrea{
    Scanner sc=new Scanner(System.in);
    double arrea;
    void satter(){
        System.out.println("enter redius: ");
        float re=sc.nextFloat();
        arrea=3.14*re*re;
    }
    void getter(){
        System.out.println("circle Arrea: "+(arrea));
    }

}

public class A1 {
    public static void main(String[] args) {
            arrea c1=new arrea();
            c1.satter();
            c1.getter();
    }
}
