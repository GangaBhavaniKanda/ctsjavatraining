package IOStreams;

import java.io.*;

public class DataStreamExample {

	public static void main(String[] args) throws IOException{
		FileInputStream fin=new FileInputStream("C:\\javatraining\\test.txt");
		BufferedInputStream bis=new BufferedInputStream(fin);
		
	}

}
