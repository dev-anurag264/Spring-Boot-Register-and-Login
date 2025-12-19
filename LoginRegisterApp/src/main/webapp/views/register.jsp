
<!DOCTYPE html>
<html>
<head>
    <title>Register | MyApp</title>
    <link rel="stylesheet" href="./css/styles.css">
</head>
<body>



<section class="auth" >
    <div class="auth-card">

        <div class="form-box	">
            <h2>Register Yourself</h2>
            <p >Join us it only takes a minute</p>
			
			<c: if test="${not empty success}">
				<h3 style="color: green">${success}</h3>
				</c: if>
				<c: if test="${not empty errorMessage}">
								<h3 style="color: green">${errorMessage}</h3>
								</c: if>
								<br></br>

            <form action="registerForm" method="post">
                <input type="text" name="name" placeholder="Full name" required><br></br>
                <input type="email" name="email" placeholder="Email address" required><br></br>
				<input type="phone" name="phone" placeholder="Phone Number" required><br></br>
                <input type="password" name="password" placeholder="Password" required><br></br>

                <button type="submit" value="Register">Register</button>
            </form>
			<p class="helper-text">
			                Already have an account?
			                <a href="loginPage">Login here</a>
			            </p>
            
        </div>

    </div>
</section>


</body>
</html>
