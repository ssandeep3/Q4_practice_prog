import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ObjectWrite_eg3 {
	public static void main(String[] args) {
		  String[][] theData = new String[2][100];
		  myobj1 o1 = new myobj1("colgate", 5);
		  myobj1 o2 = new myobj1("Oil", 10);
		  theData[0][0] = (o1.toString());
		  theData[1][0] = (o2.toString());
		  ArrayList<myobj1> l = new ArrayList<myobj1>();
//		  System.out.println(o1.toString());
//		  System.out.println("serializing theData");
		  l.add(o1);l.add(o2);
		  try {
		      FileOutputStream fout = new FileOutputStream("MyObjData.dat");
		      ObjectOutputStream oos = new ObjectOutputStream(fout);
//		      oos.writeObject(o1);oos.writeObject(o2);
		      oos.writeObject(l);
		      oos.close();
		      }
		   catch (Exception e) { e.printStackTrace(); }
		  try {
		      FileInputStream fout = new FileInputStream("MyObjData.dat");
		      ObjectInputStream oos = new ObjectInputStream(fout);
//		      o1  =  (myobj1) oos.readObject();
//		      o1 = o1.toObject(theData);
//		      System.out.println(o1.qty);
//		      System.out.println(theData[1][0]);
//		      o1  =  (myobj1) oos.readObject();
		      l = (ArrayList)oos.readObject();
		      System.out.println(l);
		      oos.close();
		      }
		   catch (Exception e) { e.printStackTrace(); }
	}
}
class myobj1 implements Serializable{
	String product;
	int qty;
	myobj1(){}
	myobj1(String p,int q){
		product = p; qty = q;
	}
	@Override
	public String toString() {
		return this.product+" "+this.qty;
	}
}
