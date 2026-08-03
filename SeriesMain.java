package MyPackage;
import java.util.Scanner;
public class SeriesMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("?x=");
		int x = s.nextInt();
		System.out.println("?n=");
		int n = s.nextInt();
		float term = 1;
		CalSeries ob = new CalSeries();
		ob.x = x;
		for(int i =2;i<=n;i++) {
//			System.out.println((float)ob.power(x,i-1));
//			System.out.println((float)ob.fact(i-1));
			 term = term +  ((float)ob.power(x,i-1)/(float)ob.fact(i-1)); 
		}
		System.out.println("Result:"+term);
	}
}
class CalSeries{
	int x;
	int fact(int n) {
		if(n>1) {
			return n * fact(n-1);
		}
		else {
			return 1;
		}
	}
	int power(int x, int p) {
		int r = x;
		for(int i=1;i<p;i++)
			r = r*x;
		return r;
	}
}
class CheckChar{
	char ch;
	void checkRange() {
		if((ch>='a' && ch<='z')||(ch>='A')&&(ch<='Z')){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch='u') {
				System.out.println("Character is Vowel..");
			}
			else {
				System.out.println("Character is Consonent..");
			}
		}
	}
	void checkRange_switchcase() {
		if((ch>='a' && ch<='z')||(ch>='A')&&(ch<='Z')){
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Character is Vowel..");
						break;
			default: System.out.println("Character is Consonent..");
			}
		}
	}
}
