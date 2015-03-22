package test.sqlServer;


import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	public static void f(){
		String dbURL = "jdbc:sqlserver://192.168.1.110:1433; DatabaseName=master";   //连接服务器和数据库sample  
		 
		String userName = "nvd11";   //默认用户名  
		 
		String userPwd = "32565624";   //密码  
		 
		Connection dbConn;  
		 
		try {  
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);  
			System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful!  
		}catch (Exception e) {  
			e.printStackTrace();  
		}  
	}  
	
	public static void g(){
		String url = "jdbc:oracle:" + "thin:@TPRHEL:1521:orcl";
		String userName = "bill";   //默认用户名  
		 
		String userPwd = "32565624";   //密码  
		 
		Connection dbConn;  
		 
		try {  
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance(); 
			dbConn = DriverManager.getConnection(url, userName, userPwd);  
			System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful!  
		}catch (Exception e) {  
			e.printStackTrace();  
		}  
	} 
	
}
