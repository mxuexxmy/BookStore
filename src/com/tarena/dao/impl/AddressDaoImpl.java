package com.tarena.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.tarena.dao.AddressDao;
import com.tarena.entity.Address;
import com.tarena.util.DBUtil;

public class AddressDaoImpl implements AddressDao {

	@Override
	public List<Address> queryByUserId(String user_id) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from tb_address where user_id=?";
		List<Address> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,user_id);
			rs = ps.executeQuery();
			while(rs.next()){
				Address address = new Address();
				address.setRid(rs.getInt("rid"));
				address.setUser_id(rs.getString("user_id"));
				address.setAddress(rs.getString("address"));
				address.setReceiver(rs.getString("receiver"));
				address.setReceiver_phone(rs.getString("receiver_phone"));
				address.setAdded(rs.getDate("added"));
				list.add(address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
