package lab7;
import java.util.Scanner;
class Complex {
    double real;
    double imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class A4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(6, 4);
        Complex c2 = new Complex(9, 5);
        Complex c3 = c1.add(c2);
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();
        System.out.print("Sum of Complex Numbers: ");
        c3.display();
    }
}