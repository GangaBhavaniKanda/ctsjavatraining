package IOStreams;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=System.getProperties();
		Set s=prop.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey() +"        "+me.getValue());
		}
		
	}

}
