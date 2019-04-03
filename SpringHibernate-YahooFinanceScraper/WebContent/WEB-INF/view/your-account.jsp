<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/normalize.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/grid.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/ionicons.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
		<link href='https://fonts.googleapis.com/css?family=Lato:100,300,300i,400' rel="stylesheet" type="text/css">
		<title>Your Account</title>
	</head>
	<body>
	
		<c:url var="home" value="/coin/logedInHome">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>
		<c:url var="about" value="/coin/about">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>
		<c:url var="cryptoUpdate" value="/coin/list">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>
			<c:url var="yourAccount" value="/coin/yourAccount">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>
		<c:url var="logout" value="/coin/logout">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>
		
		<header>
			<nav>
				<div class="row">
					<ul class="main-nav">
						<li><a href="${home}">Home</a></li>
						<li><a href="${about}">About</a></li>
						<li><a href="${cryptoUpdate}">Crypto Update</a></li>
						<li><a href="${yourAccount}">${validatedUser.firstName}'s Account</a></li>
						<li><a href="${logout}">Log Out</a></li>
					</ul>
				</div>
			</nav>			
		</header>
		<section>
		<div class="title-time-box">    
        	<h2>${validatedUser.firstName}'s Account</h2>
      	</div>
            <div class="row">
				<table>
					<tr>
						<th>Username</th>
						<th>Password</th>
						<th>First Name</th>
						<th>Last Name</th>
					</tr>	
					<tr>
						<td>${validatedUser.username}</td>
						<td>${validatedUser.password}</td>
						<td>${validatedUser.firstName}</td>
						<td>${validatedUser.lastName}</td>
					</tr>
				</table>
			</div>
		</section>
		<footer>
            <div class="row">
            	<div class="col span-1-of-2"></div>
                <div class="col span-1-of-2">
                    <ul class="social-links">
                        <li><a href="https://twitter.com/Izzy_Mesa"><i class="ion-social-twitter"></i></a></li>
                        <li><a href="https://github.com/izzyjr"><i class="ion-social-github"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="row">
                <p>
                    Copyright &copy; 2018 by Israel Mesa. All rights reserved.
                </p>
            </div>
        </footer>
	</body>
	
</html>