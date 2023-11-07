package DbConnection;
import java.sql.*;

public class ConnectionCls {
	public void Connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "tunga" , "sravan");
			Statement stmt = con.createStatement();
		}
		catch(Exception e) {
			System.out.println("error at connection class : "+ e);
			
		}
	}

}
