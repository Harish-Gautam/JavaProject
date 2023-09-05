<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="navbar.jsp" %>
<html>
 <body>
    <div style='text-align: center;margin-top:50px'>
      <c:if test="${plist=='[]'}">
        <h1 style='color:red'>Person list is empty</h1>
      </c:if>
    </div>
    <c:if test="${plist!='[]'}">
	<table style='margin:auto;font-size:20px;width:60%;margin-top:20px;border-collapse: collapse;' border='1'>
	 <tr>
	  <th>Person Id</th><th>Person name</th><th>Person address</th><th>Person phone</th><th>Person email</th>
	 </tr>
	 <c:forEach var="person" items="${plist}">
	  <tr>
	   <td>${person.pid}</td>
	   <td>${person.name}</td>
	   <td>${person.address}</td>
	   <td>${person.phone}</td>
	   <td>${person.email}</td>
	  </tr>
	 </c:forEach>
	</table>
	</c:if>
  </body>
</html>