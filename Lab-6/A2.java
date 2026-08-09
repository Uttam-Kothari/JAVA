import java.util.Scanner;

class cube {
    float height;
    float width;
    float depth;

    void setter(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter height: ");
        height=sc.nextFloat();
        System.out.print("enter width: ");
        width=sc.nextFloat();
        System.out.print("enter depth: ");
        depth=sc.nextFloat();
    }
    void getter(){
        System.out.println();
        System.out.println("Height:-"+height);
        System.out.println("width:-"+width);
        System.out.println("depth:-"+depth);
        System.out.println();
    }
    void volume(){
        System.out.println("cube volume:-"+(height*width*depth));
    }
}
public class A2 {
    public static void main(String[] args) {
        cube c1=new cube();
        cube c2=new cube();
        c1.setter();
        c2.setter();
        c1.getter();
        c2.getter();
        c1.volume();
        c2.volume();
    }
}
