import java.util.*;
public class fun{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number 1 = ");
        int a = sc.nextInt();
        System.out.print("enter the number 1 = ");
        int b = sc.nextInt();
        add(a,b);
    }
}
