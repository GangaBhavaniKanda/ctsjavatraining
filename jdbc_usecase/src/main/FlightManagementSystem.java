package main;

import java.sql.*;
class FlightManagementSystem {
    public boolean addFlight(Flight flightObj) throws ClassNotFoundException, SQLException{
        Connection con=DB.getConnection();
        String sql="insert into flight values (?,?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setInt(1,flightObj.getFlightId());
        pst.setString(2,flightObj.getSource());
        pst.setString(3,flightObj.getDestination());
        pst.setInt(4,flightObj.getNoOfSeats());
        pst.setDouble(5,flightObj.getFlightFare());
        int c=pst.executeUpdate();
        if(c!=0)
            return true;
        else
            return false;
    }
    
    }