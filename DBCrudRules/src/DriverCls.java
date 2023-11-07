import java.util.Scanner;
import java.util.Scanner;
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		System.out.println("Database CRUD Operations : ");
		System.out.println("1. Create Rule \n"
				+ "2. Insert Rule \n"
				+ "3. Update Rule \n"
				+ "4. Select Rule \n");
		System.out.println("which rule u wanna apply...");
Scanner s;
s=new Scanner(System.in);
ch=s.nextInt();
	switch(ch) {
		case 1:
			CreateCls c;
			c = new CreateCls();
			c.CreateMethod();
			break;
		case 2:
			InsertCls i;
			i = new InsertCls();
			i.InsertMethod();
			break;
		case 3:
			UpdateCls u;
			u = new UpdateCls();
			u.UpdateMethod();
			break;
		case 4:
			SelectCls s1;
			s1=new SelectCls ();
			s1.SelectMethod();
			break;
	default:
		System.out.println("error : please select correct input");
			
		}

	}

}
