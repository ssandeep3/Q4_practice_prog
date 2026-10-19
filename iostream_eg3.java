import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;

public class iostream_eg3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("File1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] b = new byte[100];
			System.out.println((char)bis.read());
//			for(int i = 0; i<b.length;i++)
//				System.out.print((char)b[i]);
		}catch(Exception e) {System.out.println(e);}
	}

	private static BufferedInputStream BufferedInputStream(java.io.FileInputStream fis) {
		// TODO Auto-generated method stub
		return null;
	}

	private static FileInputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
