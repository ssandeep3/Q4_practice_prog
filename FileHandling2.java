import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileHandling2 {
	public static void main(String[] args) {
		ByteFile b = new ByteFile();
		b.ReadByteFile();
	}
}

class ByteFile{
	void ReadByteFile() {
		try {
			FileInputStream fis = new FileInputStream("pic1.png");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("pic11.png");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int b = bis.read();
			while(b!=-1) {
				bos.write(b);
				System.out.println(b);
				b = bis.read();
			}
			fis.close();fos.close();
			System.out.println("Done..");
		}catch(Exception e) {System.out.println(e);}
	}
}