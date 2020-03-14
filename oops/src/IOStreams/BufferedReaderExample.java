package IOStreams;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("enter data");
			String str=br.readLine();
			System.out.println(str);
			
			
		}

	}

}
