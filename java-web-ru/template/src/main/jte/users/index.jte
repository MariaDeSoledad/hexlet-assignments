<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Список пользователей</h1>
        <ul class="list-group">
            @for (User user : users) {
                <li class="list-group-item">
                    <a href="/users/@{user.getId()}">@{user.getFirstName()} @{user.getLastName()}</a>
                </li>
            }
        </ul>
    </div>
</body>
</html>
