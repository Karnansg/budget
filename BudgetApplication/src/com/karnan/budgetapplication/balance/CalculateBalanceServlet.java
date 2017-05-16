package com.karnan.budgetapplication.balance;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.karnan.budgetapplication.business.Amount;
import com.karnan.budgetapplication.business.Compute;
import com.karnan.budgetapplication.database.AmountDB;

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
		String date = request.getParameter("datepicker");
		String item = request.getParameter("item");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");		
		String totalPrice = request.getParameter("totalprice");
		
		//int convertedUsedAmount = Integer.parseInt(usedAmount);		
		int retrievedAmount = AmountDB.selectAmount();
		
		//invoke method to compute balance
		Compute compute = new Compute();
		//double result = compute.balance(retrievedAmount,convertedUsedAmount);
		//String displayResult = Double.toString(result);
		
		//store the result in the session
		HttpSession session = request.getSession();
		//session.setAttribute ("result",result);
		session.setAttribute("date",date);
		session.setAttribute("item",item);
		session.setAttribute("price",price);
		session.setAttribute("quantity",quantity);
		session.setAttribute("totalPrice",totalPrice);
		
		
		
		
		
		//forward the request and response to the view
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request,response);		
	}
}