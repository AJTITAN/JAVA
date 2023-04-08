import java.util.*;
class box{
    static private String color;
    private static int l,w,h;
    static{
        System.out.println("static block created");
        color = "purple";
    }
    public static void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(color);
    }
    box(int a,int b,int c){
        l = a;
        w = b;
        h = c;
    }
}
public class stat {
    public static void main(String arg[]){
        box o1;
        o1 = new box(5,6,7);
        o1.get();
    }
}
