package Db;

import java.sql.*;

public class DbConnect {
	private Connection c ;
	private Statement st ;
	public DbConnect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
	    c= DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/testdb", "root", "Kripanand");
	    st= c.createStatement();
	}
	public void dbDisconnect()throws Exception {
		if(c!=null) {
			c.close();
		}
	}
	public java.util.HashMap checkLogin(String email,String pass) throws Exception{
		PreparedStatement p=c.prepareStatement(
	"select * from test where Email_id=? and pass=?");
		p.setString(1,email);
		p.setString(2,pass);
		ResultSet rs=p.executeQuery();
		if(rs.next()) {
			java.util.HashMap userDetails = new java.util.HashMap();
	        userDetails.put("name", rs.getString("Name"));
	        userDetails.put("email", email);
	        userDetails.put("phone", rs.getString("Phone"));
	        userDetails.put("age", rs.getInt("Age"));
	        return userDetails;
		}else {
			return null;
		}
	}
}
