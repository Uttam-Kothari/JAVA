package lab7;

import java.util.Scanner;

class angle {
    double hourang,minang,totang;
    void satter(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter hour: ");
        int hour=sc.nextInt();
        System.out.print("enter minute: ");
        int min=sc.nextInt();
        hourang=(hour*30+min*0.5);
        minang=(min*6);
        totang=Math.abs(hourang-minang); // Methode for calculater
    }
    void getter(){
        System.out.println("angle between hour and min="+(totang));
    }
    
}
public class A2 {
    public static void main(String[] args) {
            angle a1=new angle();
            a1.satter();
            a1.getter();
    }   
}
