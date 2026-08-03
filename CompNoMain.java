package MyPackage;
public class CompNoMain {
	public static void main(String[] args) {
		ComplexNo c1 = new ComplexNo();
		ComplexNo c2 = new ComplexNo();
		c1.real = 5; c1.img = 3;
		c2.real = 7; c2.img = 4;
		c1.add(c2);
	}
}
class ComplexNo{
	int real; int img;
	void add(ComplexNo x) {
		ComplexNo r = new ComplexNo();
		r.real = this.real + x.real;
		r.img = this.img + x.img;
		System.out.println("Result is:"+r.real+"+"+r.img+"i");
	}
}
