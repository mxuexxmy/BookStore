package com.tarena.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	private static ComboPooledDataSource db = new ComboPooledDataSource();
	//	��ȡ���ݿ����Ӷ���
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = db.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	//�ر�Connection
	public static void closeConnection(Connection conn){
		if(null!=conn){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//�ر�Statement
	public static void closeStatement(Statement state){
		if(null!=state){
			try {
				state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//�ر�ResultSet
		public static void closeResultSet(ResultSet rs){
			if(null!=rs){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
