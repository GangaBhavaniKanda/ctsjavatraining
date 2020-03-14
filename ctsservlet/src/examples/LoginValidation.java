package examples;
import java.sql.*;
import java.io.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int flag=0;    
		String lid=request.getParameter("login");
		String pswd=request.getParameter("pswd");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from users");
		while(rs.next()) {
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			if(lid.equals(s1) && pswd.equals(s2))
			{
				flag = 1;
				break;
			}
			
		}
		if(flag==1)
			pw.println("<b>authorized user</b>");
		else {
			response.sendRedirect("register.html");//transfer control from one server to other server
			pw.println("<b>unauthorized user</b>");
		}
		pw.println("</body></html>");
		rs.close();
		st.close();
		con.close();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
