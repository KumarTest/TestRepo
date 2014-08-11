package secretEscape;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Test_database {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, Exception {
		// TODO Auto-generated method stub

		
		String url1 ="jdbc:mysql://localhost:3306/databasename";           
		String dbClass = "com.mysql.jdbc.Driver";
		Class.forName(dbClass).newInstance();
		Connection con = DriverManager.getConnection(url1, "root", "");
		Statement stmt = (Statement) con.createStatement();
		String query = "select * from Usertable";
	//	ResultSet rs = stmt.execute();
		
		Class.forName("com.mysql.jdbc.Driver") ;
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBNAME", "usrname", "pswd") ;
		Statement stmt1 = (Statement) conn.createStatement() ;
		String query1 = "select columnname from tablename ;" ;
		ResultSet rs = ((java.sql.Statement) stmt1).executeQuery(query1) ;
		System.out.println(rs);		
	}

}
