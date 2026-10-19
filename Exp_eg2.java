
public class Exp_eg2 {
	public static void main(String[] args) {
		CheckArgumentException ch = new CheckArgumentException("Arument check exception..");
		 String str = "123ABC";
//	     int num = Integer.parseInt(str);
//	     System.out.println(num);
//	     ch.check(args);
//	     System.out.println(str.substring(5, 2));
		 Thread t = new Thread("'ii");
		 try {
			 t.sleep(-1000);
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	     
	}
}
class CheckArgumentException extends Exception{
	CheckArgumentException(String s){
		super(s);
	}
	void check(String[]a) {
		Exception e = new Exception();
		if(a.length<5) {
			try {
				throw (this);
			}catch(Exception ee) {System.out.println("No. of arguments are less..");}
		}
		else {
			int c=0;
			for(int i=0;i<5;i++) {
				c+=Integer.parseInt(a[i]);
			}
			System.out.println(c);
		}
	}
}
