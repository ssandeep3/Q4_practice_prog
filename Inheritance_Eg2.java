package MyPackage;
public class Inheritance_Eg2 {
	public static void main(String[] args) {
//		circle c1 = new circle(7.8);
//		System.out.println(c1.getArea());
//		cylinder cy1 = new cylinder(5.9, 8.4);
//		System.out.println(cy1.getVolume());
//		System.out.println("Surface Area:"+cy1.getArea());
//		cylinder cy2 = new circle(5.9);
//		circle c1 = new cylinder(6.9, 4.4);
//		System.out.println(c1.height);
		cylinder cy3 = (cylinder) new circle(4.5);
		System.out.println(cy3.radius);
//		System.out.println(cy3.height);
		
	}
}
class circle{
	double radius;
	String color;
	circle(double r){
		this.radius = r;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
}
class cylinder extends circle{
	double height;
	cylinder(double r, double h){
		super(r);
		this.height = h;
	}
	double getVolume() {
		return this.getArea()*this.height;
	}
	double getArea() {
		return (2*(3.14*radius*radius)+ (3.14*2.0*this.radius*this.height));
	}
//	double getArea() {
//		return (2*(super.getArea())+ (3.14*2.0*this.radius*this.height));
//	}
}
