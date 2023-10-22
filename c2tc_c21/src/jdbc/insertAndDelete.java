package jdbc;
import javax.sql.*;
import java.sql.*;
public class insertAndDelete {
	public static void main(String [] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_afrah","root","Afrah@2004");
			Statement st=conn.createStatement();
			{
			//inserting a record
				String sqlInsert="insert into aff values('afrah',19),('fathima',18)";
				System.out.println("the sql statement is"+sqlInsert+"\n");
				int count=st.executeUpdate(sqlInsert);
				System.out.println(count+"records inserted into aff\n");
				//delete a record
				String sqldelete="delete from aff where age=18";
				System.out.println("the sql statement is"+sqldelete+"\n");
				int c=st.executeUpdate(sqldelete);
				System.out.println(c+"record deleted\n");
			}
			}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
