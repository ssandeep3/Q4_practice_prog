package MyPackage;
import java.util.Formatter;
import java.util.Locale;
public class DateTest {
	public static void main(String[] args) {
		System.out.println("First Argument is:"+args[0]+" "+args[1]);
		Date d1  = new Date();
		d1.displayDate();
		Date d2 = new Date(4,23, 2026);
		d2.displayDate();
		System.out.println(d2);
		
	}
}

class Date{
	int month; int day; int year;
	Date(){
		this.month=1;this.day=1;this.year=2000;
	}
	Date(int mm, int dd, int yy){
		this.month = mm; this.day= dd; this.year=yy;
	}
	void displayDate(){
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
		System.out.println(month+"/"+day+"/"+year);
		System.out.println(formatter.format("%7.2f", 6.9));
	}
	public String toString() {
		return month+"/"+day+"/"+year;
	}
	
}
