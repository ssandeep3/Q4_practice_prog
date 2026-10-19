import java.util.InputMismatchException;
import java.util.Scanner;


public class excp_eg1 {
	public static void main(String[] args) {
		int a,b;
		a = 50; b = 0;
		int arr[] = new int[10];
		System.out.println(args[0]+" "+args[1]+" "+args[2]);
		int x = Integer.parseInt("10");
		System.out.println(x);
		String ss = "Jaipur";
		ss.substring(2, 3);
		Scanner s = new Scanner(System.in);
//		s=null;
		System.out.println("Enter First no.:");
		sum(4,5);
		a = s.nextInt();
		System.out.println("Enter Second no.:");
		try {
			b = s.nextInt();
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Denominator can not be zero");
		}
		/*
		 * catch(InputMismatchException e) {
		 * System.out.println("Enter numeric digits only..."); }
		 */
		catch(Exception e) {
			System.out.println("Handled by Exception class...");
		}
		try {
			checkAge(19);	
		}catch(Exception e) {System.out.println(e);}
		
		System.out.println("After Exception...");
	}
	static void sum(int a, float b) {
		System.out.println(a/b);
	}
	static void checkAge (int a) throws Exception{
		if(a<18) {
			System.out.println("Not eligible to vote..");
			Exception e = new Exception("My exception");
//			try {
				throw e;
//			}catch(Exception exp) {
//				System.out.println(exp);
//			}
		}
		else {
			System.out.println("Eligible to vote..");
		}
		MyException me = new MyException("CustomException");
		throw me;
	}
}
class MyException extends ArithmeticException{
	MyException(String s){
		super(s);
	}
	
	
}
