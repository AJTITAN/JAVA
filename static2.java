class box6{
    private static int l,w,h;
    public void set(int x,int y,int z){
        l = x;
        w = y;
        h = z;
    }
    static public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
}
class demo10{
    public static void main(String args[]){
        box6 obj1 = new box6();
        box6 obj2 = new box6();
        obj1.set(1,2,3);
        obj2.set(5,6,7);
        obj1.get();
        box6.get();
        obj2.get();
        box6.get();
    }
}