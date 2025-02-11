<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Профиль пользователя</h1>
        <p><strong>Имя:</strong> @{user.getFirstName()}</p>
        <p><strong>Фамилия:</strong> @{user.getLastName()}</p>
        <p><strong>Email:</strong> @{user.getEmail()}</p>
    </div>
</body>
</html>
