package IOStreams;
import java.io.*;
public class SerializationExample {

	public static void main(String[] args) throws IOException{
		String datafiles="C:\\javatraining\\employeedata.txt";
		ObjectOutputStream out=null;
		try {
			Emploeeeeee e1=new Emploeeeeee("ganga",2134,250000);
			Emploeeeeee e2=new Emploeeeeee("bhavani",287814,500000);
			out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(datafiles)));
			out.writeObject(e1);
			out.writeObject(e2);
			
		}
		finally {
			if(out!=null)
				out.close();
		}
		System.out.println("obj state is saved");
	}

}
