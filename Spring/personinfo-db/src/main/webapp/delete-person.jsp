<%@ include file="navbar.jsp" %>
<html>
<body>
 <form action="delete-record" method="post">
  <table style='margin:auto;border:2px solid blue;font-size:20px;margin-top:50px' cellpadding='8px'>
    <tr>
     <td>Enter person id</td>
     <td><input type="text" name='pid' value="${pid}" required></td>
      <td><button style='color:red'>Delete Record</button></td>
    </tr>
    <tr>
     <td colspan="3" align="center" style='color:red'>${msg}</td>
    </tr>
  </table>
 </form>
</body>
</html>
