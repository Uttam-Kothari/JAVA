import java.util.Scanner;

class Account {
    int accno;
    String acctype;
    double balance;

    void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter accno: ");
        accno = sc.nextInt();
        System.out.print("enter acctype: ");
        acctype = sc.next();
        System.out.print("enter balance: ");
        balance = sc.nextDouble();
    }

    void getter() {

        System.out.println();
        System.out.println("accno:-" + accno);
        System.out.println("acctype:-" + acctype);
        System.out.println("balance:-" + balance);
        System.out.println();
    }

}

public class A3 {
    public static void main(String[] args) {
        Account p1 = new Account();
        Account p2 = new Account();
        Account p3 = new Account();
        p1.setter();
        p2.setter();
        p3.setter();
        p1.getter();
        p2.getter();
        p3.getter();

    }
}
