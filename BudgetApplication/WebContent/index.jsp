<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
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
$(document).ready(function() {
	  $("#price").on("blur", calculate);
	  $("#quantity").on("blur", calculate);	
	});

	function calculate(){
	  var i = $("#price").val();
	  var k = $("#quantity").val();
	  var total = i*k;    
	  $("#totalprice").val(total);                
	}	    
</script>
 
</head>
<body> 
<section id="main">
	<fieldset class="ui-widget ui-widget-content">
		<legend>Form</legend> 	
			<form id="purchase_form" name="purchase_form" action="calculateBalance" method="post" >
				<div id="accordion">	
					<h3>Purchase</h3>
					<div><label for="Date">Date:</label>
					<label class="nofloat"><input type="text" id="datepicker" name="datepicker"></label><br>				
					<label for="Item">Item:</label>
					<input type="text" id="item" title="Enter the item name." name="item"><br>								
					<label for="Price">Price:</label>
					<input type="text" id="price" title="Enter the price." name="price"><br>				
					<label for="Quantity">Quantity:</label>
					<input type="text" id="quantity" title="Enter the quantity." name="quantity"><br>				
					<label for="TotalPrice">TotalPrice:</label>
					<input type="text" id="totalprice" name="totalprice" readonly>
					</div>
					
				</div>				
				<input class="ui-button ui-widget  ui-corner-all" type="submit" value="Submit">	
				<input class="ui-button ui-widget ui-corner-all" type="reset" value="Clear">
				<!-- <input  type="submit" value="Submit"> -->	
				<!-- <input  type="reset" value="Clear"> -->							
				</div>
			</form>		
	</fieldset>
</section>
</body>
</html>