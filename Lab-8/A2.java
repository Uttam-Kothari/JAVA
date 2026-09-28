package lab8;

class Counter {

    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects:" + count);
    }
}

public class A2{
    public static void main(String[] args) {

        Counter o1 = new Counter();
        Counter o2 = new Counter();
        Counter o3 = new Counter();

        Counter.displayCount();
    }
}