<%@ include file='conn.jsp' %>
<html>
 <body>
  <%
   String query="select * from customerinfo where cid=?";
   PreparedStatement ps=cn.prepareStatement(query);
   ps.setString(1,request.getParameter("cid"));
   ResultSet rst=ps.executeQuery();
   if(rst.next())
   {
	   %>
	   <%@ include file='navbar.jsp' %>
	   <table border='1' class='tar'>
	    <tr style='background-color:orange;color:white;font-size:1.8vw'>
	     <td colspan="2" align="center">Customer Details</td>
	    </tr>
	    <tr>
	     <th class='lb' align="left">Customer id</th>
	     <td class='lb'><%=rst.getString(1)%></td>
	    </tr>
	    <tr>
	     <th class='lb' align="left">First name</th>
	     <td class='lb'><%=rst.getString(2)%></td>
	    </tr>
	     <tr>
	     <th class='lb' align="left">Last name</th>
	     <td class='lb'><%=rst.getString(3)%></td>
	    </tr>
	     <tr>
	     <th class='lb' align="left">City</th>
	     <td class='lb'><%=rst.getString(4)%></td>
	    </tr>
	     <tr>
	     <th class='lb' align="left">Phone number</th>
	     <td class='lb'><%=rst.getString(5)%></td>
	    </tr>
	     <tr>
	     <th class='lb' align="left">Email Id</th>
	     <td class='lb'><%=rst.getString(6)%></td>
	    </tr>
	   </table>
	   <%
	   return;
   }
  %>
  <jsp:include page="search-customer.jsp" />
  <div class='dvv'>
   <label class='la' style='color:red'>Customer with id <%=request.getParameter("cid")%> not found</label>
  </div>
 </body> 
</html>