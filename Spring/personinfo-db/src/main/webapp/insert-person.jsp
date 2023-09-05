<%@ include file="navbar.jsp" %>
<html>
<body>
 <form action="save-record" method="post">
  <table style='margin:auto;border:2px solid blue;font-size:20px;margin-top:30px'>
    <tr>
     <td>Enter person id</td>
     <td><input type="text" name='pid' required></td>
    </tr>
    <tr>
     <td>Enter person name</td>
     <td><input type="text" name='name' required></td>
    </tr>
    <tr>
     <td>Enter person address</td>
     <td><input type="text" name='address' required></td>
    </tr>
    <tr>
     <td>Enter person phone</td>
     <td><input type="text" name='phone' required></td>
    </tr>
    <tr>
     <td>Enter person email</td>
     <td><input type="text" name='email' required></td>
    </tr>
    <tr>
     <td colspan="2" align="right">
      <button>Save Record</button>
     </td>
    </tr>
  </table>
 </form>
</body>
</html>
