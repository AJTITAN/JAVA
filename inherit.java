import java.util.*;
class box{
    protected int a,b,c;
    box(){
        System.out.println("Box constructor called");
    }
    public void set(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    public void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public void vol(){
        System.out.println(c*a*b);
    }
}
class d1 extends box{
    protected int d;
    d1(){
        System.out.println("d1 constructor called");
    }
    public void set(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
    }
    public void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
class d2 extends d1{
    protected String e;
    d2(){
        System.out.println("d2 constructor called");
    }
    public void set(){
        Scanner sc = new Scanner(System.in);
        e = sc.nextLine();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
    }
    public void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
public class inherit {
    public static void main(String arg[]){
        box o1 = new box();
        d1 o2 = new d1();
        d2 o3 = new d2();
        o2.set();
        o2.get();
        o3.set();
        o3.get();
    }
}
