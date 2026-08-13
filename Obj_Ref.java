package MyPackage;

public class Obj_Ref {
	public static void main(String[] args) {
		abc_ch ob = new abc_ch();
		ob.var = 200;
		xyz x = new xyz();
		x.change(ob);
		System.out.println(ob.var);
		x.change(ob);
		System.out.println(ob.var);
		abc_ch o1;// = new abc_ch();
		o1 = x.passarg();
//		o1.var1 = 100;
//		o1.fun1(100);
		System.out.println(o1.var);
		String s = "Hello";
		System.out.println("Length:"+s.length());
		System.out.println("Char at 3 is:"+s.charAt(3));
		System.out.println("'e' is at:"+s.indexOf('e'));
	}
}
class abc_ch{
	int var;
	private int var1;
	private void fun1(int a) {
		var1 = a;
	}
	private class dob{
		int dd;int mm; int yy;
	}
}
class xyz{
	void change(abc_ch o) {
		o.var = o.var*20;
	}
	abc_ch passarg() {
		abc_ch obj = new abc_ch();
		obj.var = 1000;
		return obj;
	}
}
