<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Your Omikuji Fortune</title>
</head>
<body>
    <h2>Here is your fortune:</h2>
    <p>
        In <strong>${number}</strong> years, you will live in <strong>${city}</strong> with <strong>${person}</strong> as your roommate,
        <br/>doing <strong>${hobby}</strong> for a living. The next time you see a <strong>${thing}</strong>,
        <br/>you will have good luck. Also, <strong>${nice}</strong>.
    </p>
    <br/>
    <a href="/omikuji">Try again</a>
</body>
</html>
