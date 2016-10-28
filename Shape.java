import java.util.Scanner;
class A {
    public void fun1(){

        System.out.println("the area of tringle is " );
    }
    public void fun2(){
        System.out.println("the area of square is " );
    }
    public void fun3(){
        System.out.println("the area of circle is " );
    }
};
class B extends A{
    public void fun1(){
        Scanner a=new Scanner(System.in);
        int q =a.nextInt();
        Scanner b=new Scanner(System.in);
        int w =b.nextInt();
        int e;
        e=q*w/2;
        System.out.println("the area of tringle is " +e);
    }
    public void fun2(){
        Scanner c=new Scanner(System.in);
        int t=c.nextInt();
        int r;
        r=t*t;

        System.out.println("the area of square is " +r );
    }
    public void fun3(){
        Scanner i=new Scanner(System.in);
        double y=i.nextInt();
        double u;
        u=3.14*y*y;
        System.out.println("the area of circle is " +u);
    }

};
public class Shape{
    public static void main(String[] args){
        A a = new B();
        B b = (B) a;
        b.fun1();
        b.fun2();
        b.fun3();

    }
}
