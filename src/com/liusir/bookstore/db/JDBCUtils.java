package com.liusir.bookstore.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.liusir.bookstore.exception.DBException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * JDBC 鐨勫伐鍏风被
 *
 */
public class JDBCUtils {

	
	private static DataSource dataSource = null;
	
	static{
		dataSource = new ComboPooledDataSource("javawebapp");
	}
	 
	//鑾峰彇鏁版嵁搴撹繛鎺�
	public static Connection getConnection(){  
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("鏁版嵁搴撹繛鎺ラ敊璇�!");
		}
	}
 
	//鍏抽棴鏁版嵁搴撹繛鎺�
	public static void release(Connection connection) {
		try {
			if(connection != null){
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("鏁版嵁搴撹繛鎺ラ敊璇�!");
		}
	}
	
	//鍏抽棴鏁版嵁搴撹繛鎺�
	public static void release(ResultSet rs, Statement statement) {
		try {
			if(rs != null){
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("鏁版嵁搴撹繛鎺ラ敊璇�!");
		}
		
		try {
			if(statement != null){
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("鏁版嵁搴撹繛鎺ラ敊璇�!");
		}
	}
	
}
