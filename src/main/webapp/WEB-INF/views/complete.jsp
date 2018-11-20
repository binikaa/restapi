<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:forEach var="completenames" items="${complete}">
<table>
<td>
<tr>${completenamess.firstName}</tr>
<tr>${completenamess.lastName}</tr>
<tr>${completenames.innovation}</tr>
<tr>${completenames.year}</tr>
</td>

</table>
</c:forEach>
</body>
</html>