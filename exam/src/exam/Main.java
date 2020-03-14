package exam;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
public class Main {

public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
			TravelAgency t=new TravelAgency();
			List<Package> list = null;
			list = t.generatePackageCost("D:/VarshTourPackageDetails.txt");
			/*Iterator itr=list.iterator();
			while(itr.hasNext()) {
				Package p=(Package)itr.next();
				System.out.println(p.getPackageId()+" "+p.getSourcePlace()+" "+p.getDestinationPlace()+" "+p.getNoOfDays()+" "+p.getBasicFare()+" "+p.getPackageCost());
			}*/
			List list1 = t.findPackagesWithMinimumNumberOfDays();
			Iterator itr1=list1.iterator();
			while(itr1.hasNext()) {
				Package p = (Package)itr1.next();
				System.out.println(p.getPackageId()+" "+p.getSourcePlace()+" "+p.getDestinationPlace()+" "+p.getNoOfDays()+" "+p.getBasicFare());
			}
	}

}