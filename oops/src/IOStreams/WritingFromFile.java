package IOStreams;
import java.io.*;
public class WritingFromFile {

	public static void main(String[] args)throws IOException {
		char ch;
		int x;
		try(FileReader fr=new FileReader("C:\\javatraining\\output.txt");FileWriter fw=new FileWriter("C:\\javatraining\\test.txt");){
			 x=fr.read();
			 while(x!=-1) {
				 ch=(char)x;
				 fw.write(ch);
				 System.out.print(ch);
				x=fr.read();
			 }
			
		}
	

	}

}
