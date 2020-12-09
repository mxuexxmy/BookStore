package com.tarena.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tarena.dao.OrderDao;
import com.tarena.entity.Order;
import com.tarena.entity.OrderMess;
import com.tarena.util.DBUtil;

public class OrderDaoImpl implements OrderDao {

	@Override
	public int saveOrder(Order order) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "insert into tb_order(user_id,order_id,sta) values(?,?,?)";
		int num = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, order.getUser_id());
			ps.setString(2, order.getOrder_id());
			ps.setString(3, order.getSta());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeStatement(ps);
			DBUtil.closeConnection(conn);
		}
		return num;
	}

	@Override
	public List<OrderMess> queryOrderMess(String order_id) {
		String sql = "select b.isbn,b.title,b.press,b.edition,b.price,o.count "
				+ "from tb_book b inner join tb_order_item o on "
				+ "b.isbn=o.product where order_id=?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		OrderMess om = null;
		List<OrderMess> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, order_id);
			rs = ps.executeQuery();
			while(rs.next()){
				om = new OrderMess();
				om.setOrder_id(order_id);
				om.setIsbn(rs.getString("isbn"));
				om.setTitle(rs.getString("title"));
				om.setPress(rs.getString("press"));
				om.setEdition(rs.getInt("edition"));
				om.setPrice(rs.getDouble("price"));
				om.setCount(rs.getInt("count"));
				list.add(om);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(ps);
			DBUtil.closeConnection(conn);
		}
		return list;
	}

	@Override
	public int updateByOrderId(String order_id, String address_id, double payment, Date placed) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "update tb_order set address_id=?,payment=?,placed=? where order_id=?";
		int num = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, address_id);
			ps.setDouble(2, payment);
			ps.setDate(3, placed);
			ps.setString(4, order_id);
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
