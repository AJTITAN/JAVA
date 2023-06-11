class box5{
    private static String color = "Purple";
    private int l,w,h;
    private static void fun(){
        System.out.println("run");
    }
    public void set(int x,int y,int z,String s){
        l = x;
        w = y;
        h = z;
        color = s;
        fun();
    }
    public void get(){
        System.out.println("length = "+l);
        System.out.println("width = "+w);
        System.out.println("height = "+h);
        System.out.println("color = "+color);
    }
}
class demo9{
    public static void main(String args[]){
        box5 obj1 = new box5();
        box5 obj2 = new box5();
        obj1.get();
        obj2.get();
        obj1.set(1,2,3,"red");
        obj2.set(4,5,6,"yellow");
        obj1.get();
        obj2.get();
    }
}