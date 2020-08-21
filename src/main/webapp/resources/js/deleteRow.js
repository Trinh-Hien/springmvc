$(document).ready(function(){
	  $(".deleteBtn").on("click", function(){
	        var choice = confirm("Are you sure you want to delete?");
	        if(!(choice==0)){
	            $(this).parent().preventDefault();
	        }
	    });
    
});
