<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/normalize.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/grid.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
		<link href='https://fonts.googleapis.com/css?family=Lato:100,300,300i,400' rel="stylesheet" type="text/css">
		<title>Create Account</title>
	</head>
	<body>		
		<section>
            <div class="row">
                <h2>Create Account</h2>
            </div>
            <div class="row">
                <form:form action="createUserAccount" modelAttribute="user" method="post" class="contact-form">
                
                	<div class="row">
                        <div class="col span-1-of-3">
                            <label>First Name</label>
                        </div>
                        <div class="col span-2-of-3">
                            <form:input type="text" path="firstName" placeholder="First name" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Last Name</label>
                        </div>
                        <div class="col span-2-of-3">
                            <form:input type="text" path="lastName" placeholder="Last name" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Username</label>
                        </div>
                        <div class="col span-2-of-3">
                            <form:input type="text" path="username" placeholder="Username" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>Password</label>
                        </div>
                        <div class="col span-2-of-3">
                            <form:input type="password" path="password" placeholder="Password" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col span-1-of-3">
                            <label>&nbsp;</label>
                        </div>
                        <div class="col span-2-of-3">
                            <input type="submit" value="Create Account">
                        </div>
                    </div>
                </form:form>
                <div class="row">
	                <div class="back-home">
		                <div class="col span-1-of-3">
							<a href="${pageContext.request.contextPath}/coin/welcome">Back Home</a>
		                 </div>
	             	</div>
             	</div>
            </div>
        </section>
        
	</body>
		
</html>