package lab8;

class BankAccount {

    int acNo;
    double balance;
    static String bname;
    static double irate;

    BankAccount(int acNo, double balance) {
        this.acNo = acNo;
        this.balance = balance;
    }

    static void setter(String bname, double irate) {
        bname = bname;
        irate = irate;
    }

    void display() {
        System.out.println("Account No: " + acNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bname);
        System.out.println("Interest Rate: " + irate + "%");
        System.out.println();

    }
}

public class A3 {
    public static void main(String[] args) {

        BankAccount.setter("pm Bank", 6.5);

        BankAccount a1 = new BankAccount(101, 50000);
        BankAccount a2 = new BankAccount(102, 60000);
        BankAccount a3 = new BankAccount(103, 200000);

        a1.display();
        a2.display();
        a3.display();
    }
}