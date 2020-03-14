package IOStreams;
import java.io.*;
public class BuffedReaderExample1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
			System.out.println("enter marks");
			int m1=Integer.parseInt(br.readLine());
			int m2=Integer.parseInt(br.readLine());
			int m3=Integer.parseInt(br.readLine());
			float avg=(m1+m2+m2)/3;
			System.out.println("average marks:"+avg);
			
		}

	}

}
