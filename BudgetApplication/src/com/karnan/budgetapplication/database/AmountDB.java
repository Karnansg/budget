package com.karnan.budgetapplication.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AmountDB {
	
	public static int selectAmount(){
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String retrievedAmount="";
		
		String query = "SELECT amountvalue "
					   + "FROM amount "
					   + "WHERE amount_id=1";
		try{
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next())
			{
				retrievedAmount = rs.getString("amountvalue");
			}			
			int convertedRetrievedAmount = Integer.parseInt(retrievedAmount);
			return convertedRetrievedAmount;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return 0;
		}		
	}
}