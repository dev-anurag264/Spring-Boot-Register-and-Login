
<!DOCTYPE html>
<html>
<head>
    <title>Profile | MyApp</title>
    <link rel="stylesheet" href="./css/styles.css">
</head>
<body>

<header>
    <div class="logo">MyApp</div>
    <nav>
        <a href="/">Home</a>
        <a class="active" href="/profile">Profile</a>
        <a href="logout">Logout</a>
    </nav>
</header>

<section class="auth">
    <div class="auth-card">

        <div class="form-box" style="text-align: center;">
            <h2>Welcome User</h2>

            <!-- If username is available -->
           
                <p class="subtitle">Glad to see you, ${username}</p>
           

            <!-- Fallback -->
            <c:if test="${username == null}">
                <p class="subtitle">You are successfully logged in</p>
            </c:if>
        </div>

    </div>
</section>


</body>
</html>
