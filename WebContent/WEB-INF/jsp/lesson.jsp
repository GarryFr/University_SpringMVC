<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Read lessonItem from DAO</title>
</head>
<body>

<h2>Lesson</h2>
   <table border="1" cellspacing="2" cellpadding="3">
     <tr>
        <td>Lesson</td>
        <td>${lesson}</td>
    </tr>
    <tr>
        <td>Classroom</td>
        <td>${classroom}</td>
    </tr>
    <tr>
        <td>Group</td>
        <td>${group}</td>
    </tr>
       <tr>
        <td>Teacher</td>
        <td>${teacher}</td>
    </tr>
       <tr>
        <td>Date</td>
        <td>${date}</td>
    </tr>
     <tr>
        <td>Id</td>
        <td>${id}</td>
    </tr>
</table>  
</body>
</html>