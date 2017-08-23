package com.karnan.budgetapplication.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.karnan.budgetapplication.business.Expenditure;


public class ExpenditureDB {
	
	//insert expenditure
	public static int insert(Expenditure expenditure){
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;
		
		String query = 
				"INSERT INTO Expenditure(expense_id, user_id, price, date, item, quantity) " +
			     "VALUES(?, ?, ?, ?, ?, ?)";		
		
		try
		{
			ps = connection.prepareStatement(query);
			ps.setString(1, expenditure.getExpenseId());
			ps.setString(2, Integer.toString(expenditure.getUserId()));
			ps.setString(3, Integer.toString(expenditure.getPrice()));
			ps.setString(4, expenditure.getDate());
			ps.setString(5, expenditure.getItem());
			ps.setString(6, Integer.toString(expenditure.getQuantity()));
			return ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			DBUtil.closePreparedStatement(ps);
			pool.freeConnection(connection);
		}		
	}	
}
