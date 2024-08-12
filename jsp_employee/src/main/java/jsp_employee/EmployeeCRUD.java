package jsp_employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeCRUD {
	
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "root");
	}
	public int signupEmp(Employee emp) throws Exception {
		PreparedStatement preparedStatement=getConnection().prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)");
		preparedStatement.setInt(1, emp.getId());
		preparedStatement.setString(2, emp.getName());
		preparedStatement.setLong(3, emp.getPhone());
		preparedStatement.setString(4, emp.getAddress());
		preparedStatement.setString(5, emp.getEmail());
		preparedStatement.setString(6, emp.getPassword());
		int res=preparedStatement.executeUpdate();
		getConnection().close();
		return res;
	}
	public String loginEmp(String email) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT PASSWORD FROM EMPLOYEE WHERE EMAIL=?");
		preparedStatement.setString(1, email);
		ResultSet resultset = preparedStatement.executeQuery();
		String dbPassword=null;
		while (resultset.next()) {
			dbPassword=resultset.getString("password");
		}
		connection.close();
		return dbPassword;
	}
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
