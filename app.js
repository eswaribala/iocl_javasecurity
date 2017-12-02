/**
 * 
 */

$(document).ready(function()
		{
	
	$("form").submit(function()
			{
		   
		         console.log('Form Submitted');
		        
		         email=$("#userEmail").val();
		         password=$("#userPassword").val();
		        
		         trader={
		        		 email:"",
		        		 password:""
		         };
		         trader.password=password;
		         trader.email=email;
		        
		         console.log(trader);
		         traderJSON=JSON.stringify(trader);
		         console.log(traderJSON);
		        
		        
		         
		         $.ajax(
		        	       {
		        	    	   
		        	            url:"http://localhost:7070/RestJWTTokenAPI/rest/JWTAPI",
		        	            type:'POST',
		        	            contentType: 'application/json',
		        	            data:traderJSON,
		        	            dataType:'json',
		        	            success:function(data)
		        	            {
		        	                console.log(data);
		        	                sessionStorage.setItem("token",data);

		        	            },
		        	            failure:function(x)
		        	            {
		        	               console.log(x.error());
		        	            }



		        	        }

		        	    );
		        	      
		         return false;
		       
			});
	 
		});

