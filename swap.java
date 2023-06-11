import java.util.*;
class box3{
    int a,b;
    void swap(box3 c){
        int t = c.b;
        c.b = c.a;
        c.a = t;
    }
}
class demo7{
    public static void main(String args[]){
        box3 obj = new box3();
        Scanner sc = new Scanner(System.in);
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        System.out.println("Before the swapping = "+obj.a+" & "+obj.b);
        obj.swap(obj);
        System.out.println("After the swapping = "+obj.a+" & "+obj.b);
    }
}