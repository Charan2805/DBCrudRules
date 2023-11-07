import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import DbConnection.*;
public class InsertCls {
	public void InsertMethod() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","tunga","sravan");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("insert into order1 values (101,'biryani',2,400)");
			        
			System.out.println("record inserted  successfully...");
			con.close();
			
		}
		catch(Exception e) {
			System.out.println("error at Insert class: "+e);
		}
	}

}
