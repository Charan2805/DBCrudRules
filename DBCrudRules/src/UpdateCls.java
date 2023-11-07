import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import DbConnection.*;
public class UpdateCls {
	public void UpdateMethod() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","tunga","sravan");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("update order1 set oprice = 500 where oid=101");
			        
			System.out.println(" record updated successfully...");
			con.close();
			
		}
		catch(Exception e) {
			System.out.println("error at update class :" +e);
		}
	}

}
