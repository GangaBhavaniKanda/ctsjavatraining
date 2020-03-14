package IOStreams;
import java.util.*;
import java.io.*;
public class PropertiesClassExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileReader fr=new FileReader("C:\\javatraining\\db.properties");
		prop.load(fr);;
		Set s=prop.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		fr.close();
	}

}
