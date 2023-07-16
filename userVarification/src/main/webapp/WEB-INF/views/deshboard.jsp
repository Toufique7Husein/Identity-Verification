<%@page import="java.util.jar.Attributes.Name"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Identity Verification</title>


</head>
<body>

<%

	String email = (String)request.getAttribute("email");

%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="">UserVerification</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="">Home
					<span class="sr-only">(current)</span>
			</a></li>
		</ul>


		<ul class="navbar-nav ml-auto p-1">
			<li class="nav-item shadow-sm p-1"><a class="nav-link media"
				href="login"> It's <%=email %> </a></li>
		</ul>
	</div>
</nav>

	<main>
	
	
	<main>
		<div class="container my-5 p-1 shadow-lg border-lg">

			<div class="card text-center">
				<div class="card-body">
					<h5 class="card-title">Verifying who you are!</h5>
					<p class="card-text">Photo Identity Verification</p>
					<a href="#" class="btn btn-primary">let's verify</a>
				</div>
				<div class="card-footer text-muted">Project2Morrow</div>
			</div>
		</div>
		
		<div class="container my-5 p-1 shadow-lg border-lg">

			<div class="card text-center">
				<div class="card-body">
					<h5 class="card-title">Verifying who you are!</h5>
					<p class="card-text">Passport Identity Verification</p>
					<a href="#" class="btn btn-primary">let's verify</a>
				</div>
				<div class="card-footer text-muted">Project2Morrow</div>
			</div>
		</div>
		
		<div class="container my-5 p-1 shadow-lg border-lg">

			<div class="card text-center">
				<div class="card-body">
					<h5 class="card-title">Verifying who you are!</h5>
					<p class="card-text">NID Identity Verification</p>
					<a href="#" class="btn btn-primary">let's verify</a>
				</div>
				<div class="card-footer text-muted">Project2Morrow</div>
			</div>
		</div>
	</main>
		
		
	</main>









	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>





