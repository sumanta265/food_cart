<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
       <c:forEach var="items" items="${foodItems}">
       <tr>
       <td> ${items.id }</td>
       <td>  ${items.item }</td>
       <td>  ${items.price }</td>
       </tr>      
       </c:forEach>   
       
       

       
</table>

</body>
</html>