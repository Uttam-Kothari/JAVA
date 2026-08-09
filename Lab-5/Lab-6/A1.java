import java.util.Scanner;

class student {
    String name;
    int rollno;
    double Spi;
    String Course;

    void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the student name: ");
        name = sc.next();
        System.out.print("enter roll no. : ");
        rollno = sc.nextInt();
        System.out.print("enter Spi: ");
        Spi = sc.nextDouble();
        System.out.print("enter course: ");
        Course = sc.next();
    }

    void getter() {
        System.out.println();
        System.out.println("name:-" + name);
        System.out.println("rollno:-" + rollno);
        System.out.println("spi:-" + Spi);
        System.out.println("Course:-" + Course);
        System.out.println();
    }
}

public class A1 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.setter();
        s2.setter();
        s3.setter();
        s1.getter();
        s2.getter();
        s3.getter();
    }
}
