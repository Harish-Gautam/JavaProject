<%@ include file='conn.jsp' %>
<html>
 <body>
  <div class='dvv'>
  <jsp:include page="delete-customer.jsp" />
   <%
   String query="delete from customerinfo where cid=?";
   String cid=request.getParameter("cid");
   PreparedStatement ps=cn.prepareStatement(query);
   ps.setString(1,cid);
   int n=ps.executeUpdate();
   if(n>=1)
   {
	   %>
	     <label class='la' style='color:red'>Customer record with id <%=request.getParameter("cid")%> has been deleted</label>
	   <%
   }
   else
   {
    %>
	   <label class='la' style='color:red'>Customer record with id <%=cid%> does not exist</label>
   	<%
   }
  %>
  </div>
 </body> 
</html>