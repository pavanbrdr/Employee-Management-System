package jsp_employee;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifecycle")
public class LifeCycleController extends GenericServlet{
	
	public LifeCycleController() {
		System.out.println("Instantiation is done");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() is called");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() is called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() is called");
	}

}
