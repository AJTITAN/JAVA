import java.util.*;
public class over {
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        add(a,b);
        add(a,b,c);
    }
}
