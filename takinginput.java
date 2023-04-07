import java.util.Scanner;
import java.lang.System;
public class takinginput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first element = ");
        int a = sc.nextInt();
        System.out.print("enter the second element = ");
        int b = sc.nextInt();
        int s = a+b;
        System.out.println(s);
    }
}