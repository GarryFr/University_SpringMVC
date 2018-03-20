<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Get lesson by Id</title>
</head>
<body>

<h2>Get lesson information</h2>
<form:form method="POST" modelAttribute = "lessonItem" action="showLesson">
   <table>
     <tr>
        <td><form:label path="id">Id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>