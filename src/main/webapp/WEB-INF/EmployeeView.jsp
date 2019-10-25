<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body style="background-color:#82a17b">

    
 <div class="jumbotron jumbotron-fluid" style="height:300px;background-image:url('https://image.freepik.com/free-vector/informational-poster-office-communication-flat_82574-8783.jpg')">
  <div class="container">
    <h1 class="display-4"><c:out value="${user.name}"/></h1>
  </div>
</div>


<div class="container container-fluid">

  <div class="row">



        <c:forEach items="${user.availablities}" var="a">
        <div class="col">
               	<form:form action="/availability-edit/${a.id}" method="post" modelAttribute="availability">
                	<h1><c:out value="${a.day}"/></h1>
                	<form:hidden path="day" value="${a.day }"/>
                	<form:hidden path="user" value="${a.user.id}"/>
					<input type="hidden" name="_method" value="put">
					<div class="form-group">
				    <p>
				        <form:label path="rating">Rating</form:label> 
				        <form:errors path="rating"/>
				        <form:input path="rating" value="${a.rating}"/>
				    </p>
				    </div>
				 
				    <%-- <form:hidden path="planner" value="${user.id}"/> --%>
				    <input type="submit" class="btn btn-primary" value="Edit"/>
				</form:form>
				</div>
        </c:forEach>
        

        
</div>






</div>






</body>
</html>