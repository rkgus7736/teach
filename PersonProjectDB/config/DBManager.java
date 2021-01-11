package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//싱글톤
public class DBManager {
	private static DBManager instance = new DBManager();
	private Connection conn;
	private DBManager() {
		try {
			//드라이버 로딩
			Class.forName(DBConfig.DB_DRIVER);
			//DB 접속
			conn = DriverManager.getConnection(
					DBConfig.DB_URL,DBConfig.DB_USER,DBConfig.DB_PASSWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return conn;
	}
	public static DBManager getInstance() {
		if(instance == null)
			instance = new DBManager();
		return instance;
	}
	
}



