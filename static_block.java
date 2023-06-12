// static block is called only once
class box{
    private static String color;
    private static int l,w,h;
    static {
        System.out.println("Static Block Called");
        color = "purple";
    }
    public static void set(int x,int y,int z){
        l = x; w = y; h = z;
    }
    public static void get(){
        System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(color);
    }
}
class demo11{
	public static void main(String ar[]){
		
	// box obj1=new box();
	
	box obj1=new box();
	obj1.get();
	box.get();
	
	}
}