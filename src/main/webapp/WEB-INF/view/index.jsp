<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>Hello World!</h1>

<c:forEach var="questionnaire" items="${questionnaires}">
  <s:link href="question/input/?questionnaireId=${f:u(questionnaire.id)}">
    <c:out value="${questionnaire.name}"/>
  </s:link>
  <br>
</c:forEach>
</body>
</html>