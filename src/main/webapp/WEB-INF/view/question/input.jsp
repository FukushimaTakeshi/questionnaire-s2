<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>Hello Question!</h1>

<html:errors />

<s:form action="confirm/?questionnaireId=${f:u(form.questionnaireId)}" method="POST">
  名前: <html:text property="name"/>
  <br>
  <c:forEach var="question" items="${questions}">
    Q<c:out value="${question.id}"/><br>
    <c:out value="${question.content}"/><br>
    <c:if test="${question.type == 0001}">
      <html:text property="answer"/>
    </c:if>

    <c:if test="${question.type == 0002}">
    <c:forEach var="detailContent" items="${question.detailContent}">
      <html:multibox property="answer" value="${detailContent.questionDetailId}">
        <c:out value="${detailContent.questionDetailContent}"/>
        </html:multibox>
        <br>
      </c:forEach>
	</c:if>
    
  </c:forEach>
  
  <s:submit value="送信" />

</s:form>

</body>
</html>