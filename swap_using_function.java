import java.util.*;
class box4{
    private int a,b;
    public void set(int x,int y){
        a = x;
        b = y;
    }
    public void get(){
        System.out.println(a);
        System.out.println(b);
    }
    public void swap(){
        int t = b;
        b = a;
        a = t;
    }
}
class demo8{
    public static void main(String args[]){
        box4 obj = new box4();
        obj.set(18,45);
        obj.get();
        obj.swap();
        obj.get();
    }
}