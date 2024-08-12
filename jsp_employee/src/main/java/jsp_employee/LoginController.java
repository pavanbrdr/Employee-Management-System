package jsp_employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		EmployeeCRUD crud = new EmployeeCRUD();
		try {
			String result = crud.loginEmp(email);
			if (result!=null) {
				if (result.equals(password)) {
					req.getRequestDispatcher("success.jsp");
				} else {
					req.setAttribute("message", "Invalid password");
					req.getRequestDispatcher("LogIn.jsp").forward(req, resp);
				}
			}else {
				req.setAttribute("message", "User not Registered.");
				req.getRequestDispatcher("SignUp.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
