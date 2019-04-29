<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>Hello World!</h1>

<c:forEach var="questionnaire" items="${questionnaires}">
　　<c:out value="${questionnaire.id}"/><br>
　　<c:out value="${questionnaire.name}"/><br>
</c:forEach>
</body>
</html>