<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Balance</title>
<link href="css/redmond/jquery-ui.css" type="text/css" rel="stylesheet"> 
<link href="jquery-ui.css" type="text/css" rel="stylesheet">
<link href="css/style.css" type="text/css" rel="stylesheet">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="javascript/jquery-ui.js"></script>
<script type="text/javascript" src="jquery.validate.min.js"></script>
<script type="text/javascript" src="javascript/proj.js"></script>
<script type="text/javascript" src="javascript/formvalidate.js"></script> 
<script language = "Javascript">
$(document).ready(function(){
	$("#tabs").tabs();
});
</script>
</head>
<body>
<section id="main">	
			<div id="tabs" class="ui-widget ui-widget-content">
				<ul>
					<li><a href="#tabs-1">Oveview</a></li>
					<li><a href="#tabs-2">Date</a></li>
					<li><a href="#tabs-3">Item</a></li>
					<li><a href="#tabs-4">Price</a></li>
					<li><a href="#tabs-5">Quantity</a></li>
					<li><a href="#tabs-6">Total</a></li>
					<li><a href="#tabs-7">Balance</a></li>
				</ul>
				<div id="tabs-1">
					<div>Purchase date: ${date}</div><br>
					<div>Item: ${item}</div><br>
					<div>Price: $${price}</div><br>
					<div>Quantity: ${quantity}</div><br>
					<div>TotalPrice: $${totalPrice}</div><br>
					<div>Remainder: $${remainder}</div><br>					
				</div>
				<div id="tabs-2">Purchase date: ${date}</div>
				<div id="tabs-3">Item: ${item} </div>
				<div id="tabs-4">Price:$${price}</div>
				<div id="tabs-5">Quantity:${quantity}</div>
				<div id="tabs-6">TotalPrice:$${totalPrice}</div>
				<div id="tabs-7">Remainder:$${remainder}</div>
			</div>		
			<div>
				<fieldset class="ui-widget ui-widget-content">
					<!-- <legend>Add Item</legend> -->
					Click <a href="index.jsp">here</a> to add more items.	
				</fieldset>
		</div>	
</section>
</body>
</html>