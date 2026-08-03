package MyPackage;
import java.util.Scanner;

public class TestInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inobj = new Scanner(System.in);
		System.out.print("Enter a number:");
		int i = inobj.nextInt();
		System.out.print("Enter another number:");
		int j = Integer.parseInt(inobj.next());
		
		System.out.println(i*j);
		//System.out.print("Enter String:");
		//String s = inobj.nextLine();
		//System.out.println(s);
	}
}
