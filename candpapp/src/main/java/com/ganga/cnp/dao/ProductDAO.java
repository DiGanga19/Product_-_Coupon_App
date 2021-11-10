package com.ganga.cnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ganga.cnp.model.Product;
import com.ganga.cnp.util.ConnectionUtil;

public class ProductDAO {
	public void save(Product product) {
		Connection con = ConnectionUtil.getConnection();
		try {
			PreparedStatement statement = con.prepareStatement("insert into products (name,description,price) values(?,?,?)");
			statement.setString(1, product.getName());
			statement.setString(2, product.getDescription());
			statement.setBigDecimal(3,product.getPrice());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
