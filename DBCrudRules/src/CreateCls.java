import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateCls {
	void CreateMethod () {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","tunga","sravan");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("create table order1(Oid number(3) , Oname varchar2(10), Oqty number(3), Oprice number(5))");
			        
			System.out.println("table successfully created...");
			con.close();
		}
		catch (Exception e) {
			System.out.println("error at create class : "+e);
		}
	}
}
