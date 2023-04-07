import java.util.*;

class box {
    private int l, w, h;

    box(int a, int b, int c) {
        l = a;
        w = b;
        h = c;
    }

    void set() {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
    }

    void get() {
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }

    void vol() {
        System.out.println(l * w * h);
    }
}

public class func {
    public static void main(String arg[]) {
        box o1;
        o1 = new box(10, 20, 30);
        o1.get();
        o1.vol();
    }
}
