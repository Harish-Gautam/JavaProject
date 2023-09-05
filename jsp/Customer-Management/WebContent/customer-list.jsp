<%@ include file='navbar.jsp' %>
<%@ include file='conn.jsp' %>
<html>
 <body>
  <%
  Statement st=cn.createStatement();
  ResultSet rst=st.executeQuery("select * from customerinfo");
  %>
  <div class='container'>
   <div class='card mx-auto'>
    <div class='card-body'>
     <table class='table table-hover'>
      <thead>
       <tr>
        <th class='lb'>Customer id</th><th class='la'>First name</th><th class='la'>Last name</th>
        <th class='lb'>City</th><th class='la'>Phone number</th><th class='la'>Email id</th>
        <th class='lb' style='color:magenta'>Action</th>
       </tr>
      </thead>
      <tbody>
       <%
       while(rst.next())
       {
    	   %>
    	   <tr>
    	    <td class='lb'><%=rst.getString(1)%></td>
    	    <td class='lb'><%=rst.getString(2)%></td>
    	    <td class='lb'><%=rst.getString(3)%></td>
    	    <td class='lb'><%=rst.getString(4)%></td>
    	    <td class='lb'><%=rst.getString(5)%></td>
    	    <td class='lb'><%=rst.getString(6)%></td>
    	    <td class='lb'>
    	     <a href='edit-customer.jsp?cid=<%=rst.getString(1)%>'>Edit |</a>
    	     <a href='delete-record.jsp?cid=<%=rst.getString(1)%>' onclick='return confirm("Are you sure to remove?")'>Remove</a>
    	    </td>
    	   </tr>
    	   <%
       }
       %>
      </tbody>
     </table>
    </div>
   </div>
  </div>
 </body>
</html>  