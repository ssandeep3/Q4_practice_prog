import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandeling1 {
	public static void main(String[] args) {
		FileWrite f = new FileWrite();
		f.toWrite();
		f.toRead();
	}
}
class FileWrite{
	void toWrite() {
		File f;
		FileWriter fw;
		BufferedWriter obj;
		try {
			f = new File("data.txt");
			fw = new FileWriter(f);
			obj = new BufferedWriter(fw);
			obj.write("Hello!! \t how are you...");
			obj.newLine();
			obj.close();
			System.out.println("Done..");
		}catch(Exception e) {System.out.println(e);}
	}
	void toRead() {
		try {
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
//			int a = br.read();
			String str="";
			str = br.readLine();
			br.mark(0);
			while(str!=null) {
				System.out.println(str);
				str = br.readLine();
//				br.reset();
			}		
			br.close();
		}catch(IOException e) {System.out.println(e);}
	}
}
//FileInputStream fin = new FileInputStream("file1.txt");
//BufferedInputStream bin = new BufferedInputStream(fin);
//ch=bin.read()
//FileOutputStream fileOut = new FileOutputStream("output.txt");
//BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
//byte[] bytes = data.getBytes();
//bufferOut.write(bytes);
//bufferOut.close();
