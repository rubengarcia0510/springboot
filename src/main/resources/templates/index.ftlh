<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h2>TODO LIST</h2>
    <a href="sortByPriority">Sort By Priority</a>
    <table>
        <tr>
            <td>priority</td>
            <td>description</td>
            <td>date</td>
        </tr>
        <#list tasks as task>
            <tr>
                <td>${task.priority}</td>
                <td>${task.description}</td>
                <td>${task.date}</td>
                <td><a href="${'tasks/'+task.id}">Done</a></td>
            </tr>
        </#list>
    </table>
    <a href="newTask">New Task</a>
</body>
</html>