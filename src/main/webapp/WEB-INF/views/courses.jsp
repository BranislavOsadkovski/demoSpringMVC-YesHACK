<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Courses</h5>
	<table border="1">
		<tr>
			<th>Course Id</th>
			<th>Course Name</th>
		</tr>
		<c:forEach items="${courses}" var="course">
			<tr>
				<td>${course.courseId}</td>
				<td>${course.courseName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>