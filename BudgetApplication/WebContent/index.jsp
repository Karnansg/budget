<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title> 
<link href="jquery-ui.css" type="text/css" rel="stylesheet">
<link href="css/style.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery-ui.js"></script>
<script type="text/javascript" src="javascript/proj.js"></script>
 
 
<script>
<!-- 
        $(document).ready(function(){		
        	$("#datepicker").datepicker({       		
				showOn: "button",
        		buttonImage: "images/calendar.jpg",
        		buttonImageOnly: true,
				showButtonPanel:true	
				});
        	$("#accordion").accordion({        		
        		collapsible: true          	   
        	});
        	  $(function(){
        		    $(document).tooltip();
        		  });        	
        });-->
        
        //form validation code to come here.
        $("#purchase_form").validate({
        	rules: {
        		item:{
        			required:true,
        			message:{}
        		},
        		price:{
        			required:true,
        			message:{}
        		},
        		quantity:{
        			required:true,
        			message:{}
        		}       
        	}       	
        });
       </script>
       
</head>
<body> 
<section id="main">
	<fieldset class="ui-widget ui-widget-content">
		<legend>Form</legend>	
			<form id="purchase_form" name="purchase_form" action="index.jsp" method="post" >
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
					<input type="text" id="totalprice" name="totalprice">
					</div>
					<h3>Expenditure</h3>
					<div>
					<label for="DailyTotal">DailyTotal:</label>
					<input type="text" id="dailytotal" value=""readonly><br>				
					<label for="WeeklyTotal">WeeklyTotal:</label>
					<input type="text" id="weeklytotal" readonly><br>				
					<label for="MonthlyTotal">MonthlyTotal:</label>
					<input type="text" id="monthlytotal" readonly>
					</div>	
				</div>				
				<input class="ui-button ui-widget  ui-corner-all" type="submit" value="Submit">	
				<input class="ui-button ui-widget ui-corner-all" type="reset" value="Clear">					
				</div>
			</form>		
	</fieldset>
</section>
</body>
</html>