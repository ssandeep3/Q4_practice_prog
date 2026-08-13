package MyPackage;
public class Static_Eg {
	public static void main(String[] args) {
		abc();
		Static_Class s1 = new Static_Class();
//		s1.setVar1(10);	
//		s1.display();
//		Static_Class s2 = new Static_Class();
//		s2.setVar1(20);	
//		s2.display();
//		s1.display();
	}
	static void abc() {
		System.out.println("From static method..");
	}
	static {
		System.out.println("Hello...");
	}
}
class Static_Class{
	static int var1;
	void setVar1(int a) {
		var1 = a;
	}
	void display() {
		System.out.println("Now var1 is:"+var1);
	}
	static {
		System.out.println("From Static_Class..");
	}
}