<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> Get students from DB </title>
</head>
<body>

<h4 align ="center">Get students information</h4>
<table border="1" cellspacing="2" cellpadding="3" align="center">
  <c:forEach items="${students}" var="student">
    <tr>
      <td><c:out value="${student.id}" /></td>
      <td><c:out value="${student.name}" /></td>
      <td><c:out value="${student.group.number}" /></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>