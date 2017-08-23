$(document).ready(function() {
	$("#purchase_form").validate({
		rules: {
			datepicker:{
				required:true
			},			
			item:{
				required:true
			},
			price:{
				required:true
			},			
			quantity:{
				required:true				
			}		
		}
	});	
});