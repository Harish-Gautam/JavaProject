<%@ include file='navbar.jsp' %>
<%@ include file='conn.jsp' %>
<html>
 <body>
  <%
  String query="insert into customerinfo values(?,?,?,?,?,?)";
  PreparedStatement ps=cn.prepareStatement(query);
  ps.setString(1,request.getParameter("cid"));
  ps.setString(2,request.getParameter("firstname"));
  ps.setString(3,request.getParameter("lastname"));
  ps.setString(4,request.getParameter("city"));
  ps.setString(5,request.getParameter("phone"));
  ps.setString(6,request.getParameter("email"));
  ps.executeUpdate();
  %>
  <div class='dv'>
   <label class='lah' style='color:green'>Customer record has been saved successfully</label>
  </div>
 </body>
</html>