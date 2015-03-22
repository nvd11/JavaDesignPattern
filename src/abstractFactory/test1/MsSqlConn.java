package abstractFactory.test1;

import java.sql.Connection;
import java.sql.DriverManager;
public class MsSqlConn extends SqlConnections {
	private static Connection conn = null;
	
	@Override
	public Connection getConn(){
		if (null!=conn){
			return conn;
		}
		
		return createConn();
	}
	
	private static Connection createConn(){
		String DBURL = "jdbc:sqlserver://" + GetConfig.getDBServer() + ":" + GetConfig.getDBPort()
						+ "; Database=" + GetConfig.getDBName();
		
		try{
			conn = DriverManager.getConnection(DBURL, GetConfig.getDBLogin(), GetConfig.getDBPwd());
			System.out.println("33");
		}catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		
		return conn;
	}
}
