package lab8;

class Area {

    static final double Pi = 3.14159;

    void Area(double r) {
        double area = Pi * r * r;
        System.out.println("Radius: " + r);
        System.out.println("Area of Circle: " + area);
    }
}

public class A4 {
    public static void main(String[] args) {

        Area obj = new Area();

        obj.Area(6);
    }
}