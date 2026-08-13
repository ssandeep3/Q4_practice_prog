package MyPackage;

public class Cons_eg2 {
	public static void main(String argv[]) {
		box b1 = new box();
		System.out.println(b1.area());
		box b2 = new box(5,8);
		System.out.println(b2.area());
		b2.setHeight(23);
		System.out.println(b2.area());
		b2.getDim();
	}
}
class box{
	int height; int width;
	box(){this.height = 0; this.width=0;}
	box(int h, int w){
		this.height = h; 
		this.width=w;
		}
	void getHeight() {System.out.println(this.height);}
	void setHeight(int h) {this.height = h;}
	void getDim() {System.out.println("Height="+this.height+"Width="+this.width);}
	void setDim(int h, int w) {this.height = h;this.width = w;}
	int area() {return (height*width);}
}