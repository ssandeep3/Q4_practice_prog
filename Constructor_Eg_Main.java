package MyPackage;

public class Constructor_Eg_Main {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student("24369876", "Amit", 7.9f,4);
		System.out.println(s2.redgno+s2.name+s2.cgpa+s2.sem);
		System.out.println(s1.redgno+s1.name+s1.cgpa+s1.sem);
	}
}
class student{
	String redgno;
	String name;
	float cgpa;
	int sem;
	student(){
		redgno = null; name = null;
		cgpa=0.0f; sem =0;
	}
	student(String redgno, String name, float cgpa, int sem){
		this.redgno = redgno;
		this.name = name;
		this.cgpa = cgpa;
		this.sem = sem;
	}
}


