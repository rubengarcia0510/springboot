<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h2>TODO LIST</h2>
    <form action="/process/form" method="post">
        <div>
            <label>Description</label>
            <input type="text" name="description"/>
        </div>
        <div>
            <label>Priority</label>
            <input type="number" name="priority"/>
        </div>
        <div>
            <label>Date</label>
            <input type="date" name="date"/>
        </div>
        <input type="submit" value="Add"/>

    </form>
</body>
</html>