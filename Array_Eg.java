package MyPackage;
public class Array_Eg {
	public static void main(String[] args) {
		MyArray ob = new MyArray();
		ob.show();
	}
}
class MyArray{
	int a[];
	void show() {
		a = new int[20];
		a[0] = 30;
		System.out.println("a[0]="+a[0]);
		char ch[] = new char[10];
		ch[0]='A';ch[1]='B';ch[2]='C';
		System.out.println(ch[0]);
		int var1;
		System.out.println(var1=10);
	}
}
