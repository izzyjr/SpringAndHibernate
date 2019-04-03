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
		<title>Home</title>
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
			<div class="row">
				<div class="title-time-box">    
                	<h2>Development Process</h2>
            	</div>
			</div>
			<div class="row">
				<div class="main-text">
					<p>
						<em>Lorem ipsum dolor sit amet,</em> consectetur adipiscing elit. Proin molestie volutpat sapien congue blandit. 
						Fusce a sapien vel sapien condimentum tincidunt. Sed ultrices, quam et hendrerit euismod, velit turpis rutrum ex,
						sed pellentesque nibh justo eget tortor. Nullam dictum tincidunt interdum. Suspendisse suscipit dolor vel felis
						laoreet placerat. Aenean rutrum, tellus luctus congue gravida, leo diam euismod odio, ac sollicitudin massa enim id ipsum.
						Praesent auctor sodales tincidunt. Morbi ac lorem erat.<br><br>Fusce at dolor eu purus cursus finibus ut eget tortor. 
						Integer eu placerat orci, in dictum odio. Curabitur posuere libero in varius auctor. Curabitur et interdum tellus,
						sed porta ligula. Aenean consequat turpis sit amet dui auctor, a rutrum lacus semper. Cras arcu diam, scelerisque 
						nec leo bibendum, congue vehicula erat. Donec quis nisl ex.<br><br>Sed imperdiet ex dolor, sed accumsan magna dignissim at.
						Proin molestie pellentesque pulvinar. Nunc faucibus augue vitae enim vulputate porttitor non in dui. Integer pretium placerat orci,
						in porta lorem cursus nec. Donec sit amet leo est. Vestibulum ut tortor ut nunc sollicitudin fermentum a eu mi.
						Etiam dictum efficitur bibendum. Sed in elit at lacus rhoncus dignissim non et dolor. Donec sed vulputate velit.
						Phasellus lobortis orci et magna blandit molestie. Ut consequat nisl risus, in blandit ante gravida at.
						Maecenas et tristique ipsum, sit amet hendrerit augue. Aenean lacinia augue eget quam ultricies vestibulum.
						Proin ultricies eu eros vitae bibendum. Sed facilisis eget mi a malesuada.<br><br>Maecenas vel orci hendrerit, ornare libero et, 
						porttitor libero. Praesent a nulla eget arcu dignissim dignissim. Vivamus ac diam feugiat, feugiat lorem vel, vestibulum diam.
						Pellentesque sed tellus vel erat porta consequat sit amet ac tellus. Donec pharetra purus id arcu tincidunt, 
						quis viverra leo vehicula. Mauris vel ante ut orci feugiat fermentum. Proin non nulla ac diam consectetur faucibus. 
						Mauris orci urna, dapibus vitae nulla non, interdum porta diam. Vestibulum sit amet sem imperdiet, hendrerit dolor in, iaculis ipsum. 
						Praesent et magna sit amet sem tempor vehicula. Suspendisse ut euismod turpis. Maecenas nec velit aliquam, pellentesque tellus eget, 
						vulputate nibh.
					</p>
				</div>
			</div>
		</section>
		<div class="footer">
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
        </div>
	
	</body>

</html>