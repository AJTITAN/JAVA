class box1{
    int a;
    int b;
    int c;
    void set(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }
    void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    void volume(){
        System.out.println("the volume is "+a*b*c);
    }
}
class demo3{
    public static void main(String args[]){
        box1 obj = new box1();
        obj.set(10,11,12);
        obj.get();
        obj.volume();
    }
}