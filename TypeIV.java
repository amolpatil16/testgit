import java.sql.*;
import javax.sql.*;
public class TypeIV
{
public static void main(String args[])throws Exception
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("The driver is loaded");
}
catch(ClassNotFoundException clse)
{
clse.printStackTrace();
}
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","amol");
System.out.println("connected");
Statement stat=con.createStatement();
System.out.println("Statement created");
ResultSet rset=stat.executeQuery("SELECT* FROM emp");
int r=stat.executeUpdate("insert into emp values(1,'amol','Director',12000)");

while(rset.next())
{
System.out.println(rset.getInt(1)+"  "+rset.getString(2)+"  "+rset.getString(3)+"  "+rset.getFloat(6));
}
System.out.println(r+"rows affected");

}
catch(SQLException e)
{
e.printStackTrace();
}
}
}
