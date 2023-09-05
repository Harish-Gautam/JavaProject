<%@ include file="navbar.jsp" %>
<html>
 <body>
   <form action='update-record' method="post">
    <table style='margin:auto;font-size:20px;width:40%;margin-top:20px;border-collapse: collapse;' border='1'>
	  <tr style='background-color:orange;color:white;font-size:22px'>
	   <th align="center" colspan="2">Person Details</th>
	  </tr>
	  <tr>
	   <th align="left">Person Id</th>
	   <td><input type='text' value='${person.pid}' name='pid' readonly="readonly"></td>
	  </tr>  
	  <tr>
	   <th align="left">Person name</th>
	   <td><input type='text' value='${person.name}' name='name'></td>
	  </tr>
	  <tr>
	   <th align="left">Person address</th>
	   <td><input type='text' value='${person.address}' name='address'></td>
	  </tr>
	  <tr>
	   <th align="left">Person phone number</th>
	   <td><input type='text' value='${person.phone}' name='phone'></td>
	  </tr>
	  <tr>
	   <th align="left">Person email id</th>
	   <td><input type='text' value='${person.email}' name='email'></td>
	  </tr>
	  <tr>
	   <td colspan="2" align="right">
	    <button>Update Record</button>
	   </td>
	  </tr>
	</table>
	</form>
  </body>
</html>