package MyPackage;
public class toString_Eg {
	public static void main(String[] args) {
		abc ob = new abc();
		System.out.println(ob.getVar());
		System.out.println(ob);
	}
}
class abc{
	int var;
	abc(){ var = 100; }
	int getVar() {
		return var; 
	}
	public String toString(){
		String s;
		s= "%%"+var;
		return s;
	}
	Integer var1 = new Integer(100);
}
