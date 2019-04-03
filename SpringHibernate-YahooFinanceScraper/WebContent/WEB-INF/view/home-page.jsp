<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/normalize.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vendors/css/grid.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
		<link href='https://fonts.googleapis.com/css?family=Lato:100,300,300i,400' rel="stylesheet" type="text/css">
		<title>Home</title>
	</head>
	<body>
	
		<c:url var="about" value="/coin/about">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>
		
		<c:url var="cryptoUpdate" value="/coin/list">
			<%-- <c:param name="" value=""></c:param> --%>
		</c:url>			
		
		<header>
			<nav>
				<div class="row">
					<ul class="main-nav">
						<li><a href="welcome">Home</a></li>
						<li><a href="${about}">About</a></li>
						<li><a href="${cryptoUpdate}">Crypto Update</a></li>
						<li><a href="loginForm">Log In</a></li>
					</ul>
				</div>
			</nav>			
		</header>
		<section>
			<div class="row">
				<div class="hero-text-box">    
	                <h1>Get a quick Crypto Update now.</h1>
	                <a class="btn btn-full" href="createAccountForm">Create Account</a>
	                <a class="btn btn-ghost" href="loginForm">Log In</a>
            	</div>
			</div>
		</section>
		
	</body>

</html>