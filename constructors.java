class box2{
    private int a,b,c;
    box2(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }
    void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class demo4{
    static public void main(String args[]){
        box2 obj = new box2(1,2,3);
        obj.get();
    }
}