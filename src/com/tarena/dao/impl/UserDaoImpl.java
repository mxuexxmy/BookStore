package com.tarena.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tarena.dao.UserDao;
import com.tarena.entity.User;
import com.tarena.util.DBUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public User login(String uname, String upwd, int role) {
		String sql = "select * from tb_user where uname=? and upwd=? and role=?";
		//	��ȡ����	
		Connection conn = DBUtil.getConnection();
		//	��ȡִ��SQL������
		User user = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, upwd);
			ps.setInt(3, role);
			//ִ��SQL���
			rs = ps.executeQuery();
			//��������
			while(rs.next()){
				user = new User();
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setRole(rs.getInt("role"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(ps);
			DBUtil.closeConnection(conn);
		}
		return user;
	}

	@Override
	public User queryName(String name) {
		String sql = "select * from tb_user where uname=?";
		//	��ȡ����	
		Connection conn = DBUtil.getConnection();
		//	��ȡִ��SQL������
		User user = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			//ִ��SQL���
			rs = ps.executeQuery();
			//��������
			while(rs.next()){
				user = new User();
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setRole(rs.getInt("role"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(ps);
			DBUtil.closeConnection(conn);
		}
		return user;
	}

	@Override
	public User queryPhone(String phone) {
		String sql = "select * from tb_user where phone=?";
		//	��ȡ����	
		Connection conn = DBUtil.getConnection();
		//	��ȡִ��SQL������
		User user = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, phone);
			//ִ��SQL���
			rs = ps.executeQuery();
			//��������
			while(rs.next()){
				user = new User();
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setRole(rs.getInt("role"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(ps);
			DBUtil.closeConnection(conn);
		}
		return user;
	}

	@Override
	public int insertUser(User user) {
		String sql = "insert into tb_user(uname,upwd,email,phone,role) values(?,?,?,?,?)";
		Connection conn = DBUtil.getConnection();
		//	��ȡִ��SQL������
		PreparedStatement ps = null;
		int num=0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2,user.getUpwd());
			ps.setString(3, user.getEmail());
			ps.setString(4,user.getPhone());
			ps.setInt(5, user.getRole());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeStatement(ps);
			DBUtil.closeConnection(conn);
		}
		return num;
	}

	

}
