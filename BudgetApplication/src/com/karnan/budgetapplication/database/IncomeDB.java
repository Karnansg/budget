package com.karnan.budgetapplication.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.karnan.budgetapplication.business.Expenditure;
import com.karnan.budgetapplication.business.Income;

public class IncomeDB {
	
	public static Income retrieveNetPay(String userId){
		
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT netpay " +
					   "FROM income " +
					   "WHERE user_id = ?";		
		try
		{
			ps = connection.prepareStatement(query);
			ps.setString(1, userId);			
			rs = ps.executeQuery();
			Income income = null;			
			if(rs.next())
			{
				income = new Income();
				income.setNetPay(Integer.parseInt(rs.getString("netpay")));
			}
			return income;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(ps);			
			pool.freeConnection(connection);
		}		
	}	
}