
<!DOCTYPE html>
<html>
<head>
    <title>Login | MyApp</title>
    <link rel="stylesheet" href="./css/styles.css">
</head>
<body>



<section class="auth">
    <div class="auth-card">

        <div class="form-box">
            <h2>Welcome Back</h2>
            <p class="subtitle">Login to continue</p>

           <form action="loginForm" method="post">
                <input type="email" name="email" placeholder="Email address" required>
                <input type="password" name="password" placeholder="Password" required>

                <!-- CSRF (if Spring Security enabled) -->
                <input type="hidden" name="" value="">

                <button type="submit">Login</button>
            </form>

            <p class="helper-text">
                Dont have an account?
                <a href="register">Create one</a>
            </p>
        </div>

    </div>
</section>



</body>
</html>