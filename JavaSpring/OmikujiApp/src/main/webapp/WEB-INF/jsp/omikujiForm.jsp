<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<img src="/logo.png" alt="Omikuji Logo">
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Form</title>
</head>
<body>
    <h1>Omikuji Fortune Form</h1>
    <form action="/omikuji/process" method="POST">
        <label>Pick a number (1-100):</label><br/>
        <input type="number" name="number" required /><br/><br/>

        <label>City name:</label><br/>
        <input type="text" name="city" required /><br/><br/>

        <label>Someone's name:</label><br/>
        <input type="text" name="person" required /><br/><br/>

        <label>Hobby:</label><br/>
        <input type="text" name="hobby" required /><br/><br/>

        <label>Thing to say:</label><br/>
        <input type="text" name="thing" required /><br/><br/>

        <label>Nice thing:</label><br/>
        <input type="text" name="nice" required /><br/><br/>

        <button type="submit">Send</button>
    </form>
</body>
</html>
