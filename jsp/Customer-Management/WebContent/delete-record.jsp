<%@ include file='navbar.jsp' %>
<%@ include file='conn.jsp' %>
<html>
 <body>
  <%
  String query="delete from customerinfo where cid=?";
  PreparedStatement ps=cn.prepareStatement(query);
  ps.setString(1,request.getParameter("cid"));
  ps.executeUpdate();
  response.sendRedirect("customer-list.jsp");
  %> 

 </body>
</html>