

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uid=request.getParameter("lid");
		String pwd=request.getParameter("pwd");
		int flag=0;
		String userType=null;
		pw.println("<html><body>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","root");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from users");
			while(rs.next()) {
				if(rs.getString(1).equals(uid) && rs.getString(2).equals(pwd))
				{
					if(uid.equals("admin") && pwd.equals("admin")){
						flag=1;
						userType="Admin";
						break;
					}
					else
					{
						flag=1;
						userType="Associate";
						break;
					}
				}
				else
					flag=0;
			}
			if(flag==1) {
				request.setAttribute("type",userType);
					if(userType.equalsIgnoreCase("admin")) {
						this.getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
					}
					else {
						this.getServletContext().getRequestDispatcher("/associate.jsp").forward(request, response);
					}
			}
			else
			{
				pw.println("fail");
			}
		}
		catch(Exception e) {
			
		}
		pw.println("</body></html>");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
