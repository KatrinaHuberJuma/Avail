<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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



<div class="reg" style="display:inline-block; width:500px; height:450px; background: linear-gradient(to top left, #f39f2b 0%, #f27b67 100%); text-align: center;">
    <h1>Register!</h1>

    <p><form:errors path="user.*"/></p>

    <form:form method="POST" action="/registration" modelAttribute="user">
         <p>
            <form:label path="name">Name:</form:label>
            <form:input type="text" path="name" placeholder="Name"/>
        </p>
        <p>
            <form:label path="email">email:</form:label>
            <form:input type="email" path="email" placeholder="example@gmail.com"/>
        </p>

        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password" placeholder="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation" placeholder="password must match"/>
        </p>
        <input type="submit" class="btn btn-warning" value="Register!"/>
    </form:form>
    </div>
    <div class="login" style="display: inline-block; width: 500px; height:450px; background: linear-gradient(to top left, #0c2f29 0%, #83a17b 100%); vertical-align: top; text-align: center;
    ">
        <h1>Login</h1>
            <p><c:out value="${error}" /></p>
            <form method="post" action="/login">
                <p>
                    <label for="email">Email</label>
                    <input type="text" id="email" name="email"/>
                </p>
                <p>
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password"/>
                </p>
                <input type="submit" class="btn btn-danger" value="Login!"/>
            </form>
    </div>
</body>
</html>