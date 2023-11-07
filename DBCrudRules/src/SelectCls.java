import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import DbConnection.*;
public class SelectCls {
	public void SelectMethod () {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","tunga","sravan");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from order1");
			System.out.println("table records from order1 table...");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+ rs.getInt(3)+ " "+ rs.getInt(4));
			}
			con.close();	
		}
		catch(Exception e) {
			System.out.println("error at select class : "+ e);
		}
	}

}
