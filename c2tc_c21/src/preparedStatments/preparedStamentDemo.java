package preparedStatments;
import java.sql.*;
import javax.sql.*;
public class preparedStamentDemo {
public static void main(String [] args) {
	try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_afrah","root","Afrah@2004");
		Statement stmt=conn.createStatement();
		{//insert
			String ins="insert into aff values('darshan raval',29)";
			System.out.println("the sql statement was"+ins);
			int countins=stmt.executeUpdate(ins);
			System.out.println(countins+"rows affected");
			//delete
			String sqldelete="delete from aff where age=18";
			System.out.println("the sql statement is"+sqldelete+"\n");
			int countdel=stmt.executeUpdate(sqldelete);
			System.out.println(countdel+"record deleted\n");
			//update
			String sqlupdate="update aff set age=25 where age=19";
			System.out.println("the sql statement is"+sqlupdate+"\n");
			int countup=stmt.executeUpdate(sqlupdate);
			System.out.println(countup+"record updated\n");
			//select
			String select = "select * from aff";
			ResultSet res = stmt.executeQuery(select);
			while(res.next())
			{
				System.out.println(res.getInt("age"));
				System.out.println(res.getString("name"));
			
				
			}
		}
		
		
		
	}
	catch(SQLException e) {
		
	}
}
}
