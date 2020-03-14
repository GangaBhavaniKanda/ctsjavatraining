package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployeeDao;
import data.Employee;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao empdao=new EmployeeDao();
		Employee emp=new Employee();
		emp.setEmp_id((String)request.getParameter("id"));
		emp.setEmp_name((String)request.getParameter("name"));
		emp.setDept((String)request.getParameter("dept"));
		emp.setDesg((String)request.getParameter("desg"));
		emp.setEmail((String)request.getParameter("email"));
		request.setAttribute("emp", emp);
		int flag=0;
		try {
			flag=empdao.insertEmployee(emp);
		}
		catch(Exception e) {}
		if(flag==1) {
			request.setAttribute("empdata", emp);
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/insertionSuccess.jsp");
				rd.forward(request, response);
				
			}
			else {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/insertionFailure.jsp");
				rd.forward(request, response);
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
