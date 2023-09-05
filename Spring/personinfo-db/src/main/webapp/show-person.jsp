<%@ include file="navbar.jsp" %>
<html>
 <body>
    <table style='margin:auto;font-size:20px;width:40%;margin-top:20px;border-collapse: collapse;' border='1'>
	  <tr style='background-color:orange;color:white;font-size:22px'>
	   <th align="center" colspan="2">Person Details</th>
	  </tr>
	  <tr>
	   <th align="left">Person Id</th>
	   <td>${person.pid}</td>
	  </tr>  
	  <tr>
	   <th align="left">Person name</th>
	   <td>${person.name}</td>
	  </tr>
	  <tr>
	   <th align="left">Person address</th>
	   <td>${person.address}</td>
	  </tr>
	  <tr>
	   <th align="left">Person phone number</th>
	   <td>${person.phone}</td>
	  </tr>
	  <tr>
	   <th align="left">Person email id</th>
	   <td>${person.email}</td>
	  </tr>
	</table>
  </body>
</html>