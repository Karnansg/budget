package com.karnan.budgetapplication.balance;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.karnan.budgetapplication.business.Amount;
import com.karnan.budgetapplication.business.Compute;
import com.karnan.budgetapplication.business.Expenditure;
import com.karnan.budgetapplication.business.Income;
import com.karnan.budgetapplication.database.AmountDB;
import com.karnan.budgetapplication.database.ExpenditureDB;
import com.karnan.budgetapplication.database.IncomeDB;


@WebServlet("/CalculateBalanceServlet")
public class CalculateBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
   
    public CalculateBalanceServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/result.jsp";
		//get the user id via the session
		/****/
		
		String date = request.getParameter("datepicker");
		String item = request.getParameter("item");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");		
		String totalPrice = request.getParameter("totalprice");
		
		//create the expenditure object
		//userId hardcoded for test
		String userId = "1";
		Expenditure expenditure = new Expenditure();
		Expenditure expenditureData = new Expenditure();
		expenditure.setUserId(Integer.parseInt(userId));
		expenditure.setPrice(Integer.parseInt(price));
		expenditure.setDate(date);
		expenditure.setItem(item);		
		expenditure.setQuantity(Integer.parseInt(quantity));
		expenditure.setTotalPrice(Integer.parseInt(totalPrice));
		expenditureData = expenditure;		
		
		/*
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("D:\\expenditureData.json"), expenditureData);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//invoke method to insert new row in expenditure table
		ExpenditureDB.insert(expenditure);	
	
		
		//invoke method to retrieve netpay
		Income income = IncomeDB.retrieveNetPay(userId);
		int netPay = income.getNetPay();
		
		//invoke method to compute balance
		double remainder = Compute.balance(netPay, Integer.parseInt(totalPrice));
		
		//double result = compute.balance(retrievedAmount,convertedUsedAmount);
		//String displayResult = Double.toString(result);
		
		//store the result in the session
		HttpSession session = request.getSession();		
		session.setAttribute("date",date);
		session.setAttribute("item",item);
		session.setAttribute("price",price);
		session.setAttribute("quantity",quantity);
		session.setAttribute("totalPrice",totalPrice);
		session.setAttribute("remainder",remainder);	
		
		//forward the request and response to the view
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request,response);		
	}
}