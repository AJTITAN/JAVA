import java.util.*;
class demo5{
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String args[]){
        int a,b,c;
		Scanner scobj=new Scanner(System.in);
		a=scobj.nextInt();
		b=scobj.nextInt();
		c=scobj.nextInt();	
		add(a,b);
		add(a,b,c);
    }
}