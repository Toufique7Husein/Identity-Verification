<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Identity Verification</title>
</head>
<body>


	<div class="container my-5 p-1 shadow-lg border-lg"
		class="border border-primary">
		<form action="userData" method="post">
			<!-- Name input -->
			<div class="form-outline mb-4">
				<input type="text" id="registerName" class="form-control"
					placeholder="First Name" name="firstName" />
			</div>
			<div class="form-outline mb-4">
				<input type="text" id="registerName" class="form-control"
					placeholder="Last Name" name="lastName" />
			</div>
			<div class="form-outline mb-4">
				<input type="text" id="registerName" class="form-control"
					placeholder="Adress" name="address" />
			</div>
			
			<!-- Password input -->
			<div class="form-outline mb-4">
				<input type="password" id="registerPassword" class="form-control"
					placeholder="Password" name="password" />
			</div>

			<!-- Repeat Password input -->
			<div class="form-outline mb-4">
				<input type="password" id="registerRepeatPassword"
					class="form-control" placeholder="Confirm Password" name="confirm" />

			</div>

			<!-- Submit button -->
			<button type="submit" class="btn btn-primary btn-block mb-3">Sign
				in</button>
		</form>

	</div>
	<!-- Pills content -->




	</div>

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