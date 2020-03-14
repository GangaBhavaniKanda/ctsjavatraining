//reading character from keyboard and stored into file
package IOStreams;
import java.io.*;
public class InputfrmKeyboardStoredinFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try(InputStreamReader cin=new InputStreamReader(System.in);FileWriter out=new FileWriter("C:\\javatraining\\output.txt");) {
			 System.out.println("enter character q to quit");
			 char c;
			 do {
				 c=(char)cin.read();
				 out.write(c);
			 }while(c!='q');
		}
	}

}
