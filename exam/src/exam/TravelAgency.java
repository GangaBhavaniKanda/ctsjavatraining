package exam;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TravelAgency {
	public List<Package> generatePackageCost (String filePath) throws IOException, SQLException{
					List<Package>result=new ArrayList<Package>();
					Connection con=null;
					try {
						 con=DBHandler.establishConnection();
					}
					catch (ClassNotFoundException e) {
						e.printStackTrace();
					} 
				
					ArrayList list=new ArrayList();
					FileReader fr=new FileReader(filePath);
					BufferedReader br=new BufferedReader(fr);
					String line=null;
					while((line=br.readLine())!=null) 
					{
						list.add(line);
					}
					Iterator itr=list.iterator();
					while(itr.hasNext()) {
						String []pack=itr.next().toString().split(",");
						String packageId=pack[0];
						String sourcePlace=pack[1];
						String destinationPlace=pack[2];
						int basicFare=Integer.parseInt(pack[3]);
						int noOfDays=Integer.parseInt(pack[4]);
						boolean res=validate(packageId);
						double discountper=0;
						if(res==true) {
								if(noOfDays<=5)
										discountper=0;
								else if(noOfDays>5 && noOfDays<=8)
										discountper=3;
								else if(noOfDays>8 && noOfDays<=10)
										discountper=5;
								else if(noOfDays>10)
									discountper=7;
								double pac_cost=(noOfDays*basicFare);
								double cost=pac_cost-(pac_cost*(discountper/100));
								double totalcost=cost+(cost*0.12);
								Package obj=new Package();
								obj.setPackageId(packageId);
								obj.setSourcePlace(sourcePlace);
								obj.setDestinationPlace(destinationPlace);
								obj.setBasicFare(basicFare);
								obj.setNoOfDays(noOfDays);
								obj.setPackageCost(totalcost);
								result.add(obj);
								String sql="insert into package_details values(?,?,?,?,?)";
								PreparedStatement pst=con.prepareStatement(sql);
								pst.setString(1,packageId );
								pst.setString(2,sourcePlace );
								pst.setString(3,destinationPlace);
								pst.setInt(4,noOfDays);
								pst.setInt(5,(int)totalcost);
								pst.executeUpdate();
						}
						else {
							
						}
						
					}
					return result;
	}
	public boolean validate(String packageId) {
		Pattern p=Pattern.compile("[0-9]{3}/[a-zA-z]{3}");
		Matcher m=p.matcher(packageId);
		boolean res=m.matches();
		return res;
			

	}
	public List<Package> findPackagesWithMinimumNumberOfDays() throws ClassNotFoundException, IOException, SQLException
	{		List<Package>list=new ArrayList<Package>();
			String query="select * from package_details group by package_id having min(no_of_days) ";
			Connection con=DBHandler.establishConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Package p=new Package();
				p.setPackageId(rs.getString(1));
				p.setSourcePlace(rs.getString(2));
				p.setDestinationPlace(rs.getString(3));
				p.setNoOfDays(rs.getInt(4));
				p.setBasicFare(rs.getInt(5));
				list.add(p);
			}
			return list;
	
	}
}