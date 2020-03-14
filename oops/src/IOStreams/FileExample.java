package IOStreams;
import java.io.*;
public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream f=new FileInputStream("C:\\javatraining\\test.txt");
		FileOutputStream fout=new FileOutputStream("C:\\javatraining\\output.txt");
		int i;
		while((i=f.read())!=-1) {
			char ch=(char)i;
			System.out.print(ch);
			fout.write(ch);
		}
			f.close();
			fout.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not available");
		}
		catch(IOException e) {
			System.out.println("IO EXCEPTION");
		}
		
		}

}
