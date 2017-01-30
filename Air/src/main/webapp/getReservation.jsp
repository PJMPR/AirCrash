<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Podaj id rezerwacji:<input type="text" id="id"/>
	<button id="showReservations">Pokaż rezerwacje</button>
	<div id="content"></div>
	
	<script type="text/javascript" src="scripts/jquery.js"></script>
	<script type="text/javascript">
		
		var textbox = $('#id');
		var button = $('#showReservations');
		var content = $('#content');
		
		button.click(function(){
			
			var id = textbox.val();
			
			$.ajax({
				  url: "rest/reservations/"+id+"",
				  method:'GET',
				  success: function( result ) {
						var reservations ='';
					  for(var i= 0; i<result.length;i++){
						  reservations = reservations.concat("<p>");
						  reservations = reservations.concat(result[i].date);
						  reservations = reservations.concat(" ");
						  reservations = reservations.concat(result[i].track);
						  reservations = reservations.concat(" ");
						  reservations = reservations.concat(result[i].price);
						  reservations = reservations.concat("</p>");
						}
					  content.html(reservations);
				  }
				});
			
		});
		
	</script>
</body>
</html>