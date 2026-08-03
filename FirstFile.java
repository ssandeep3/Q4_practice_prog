package MyPackage;

public class FirstFile {
	public static void main(String args[]) {
		System.out.println("MSG");
		WhiteBoard wb1 = new WhiteBoard();
		wb1.h = 100;
		wb1.w = 200;
		wb1.getArea();
		WhiteBoard wb2 = new WhiteBoard();
		wb2.h = 300;
		wb2.w = 400;
		wb2.getArea();
		wb2.addnum();
	}
}
class WhiteBoard{
	int h;
	int w;
	void getArea(){
		int a;
		a = h*w;
		System.out.println("Area is:"+a);
	}
	void addnum() {
		//System.out.println(a);
		System.out.println(h+w);
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("Let\"s go");
		System.out.println((byte)129);
	}
}
