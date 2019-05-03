<%@page pageEncoding="UTF-8"%>
<html>
<body>
<h1>confirm</h1>
<s:form action="create/?questionnaireId=${f:u(form.questionnaireId)}" method="POST">
	Q<c:out value="${questionsAndAnswers.name}"/><br>
	<input type="hidden" name="name" value="${f:h(questionsAndAnswers.name)}"/>
	
	<c:forEach var="question" items="${questions}" varStatus="status">
		<c:out value="${question.content}"/><br>
		
		<c:forEach var="questionAndAnswer" items="${questionsAndAnswers.questionsAndAnswers}" varStatus="status">
			<c:if test="${question.id == questionAndAnswer.key}">
				<c:if test="${question.type == 0001}">
			    	回答: ${f:h(questionAndAnswer.value)}
			    	<input type="hidden" name="answer.${question.id}" value="${f:h(questionAndAnswer.value)}"/>
			    </c:if>
				<c:if test="${question.type == 0002}">
					<c:forEach var="detailContent" items="${question.detailContent}">
						<c:if test="${detailContent.questionDetailId == questionAndAnswer.value}">
					    	回答: ${f:h(detailContent.questionDetailContent)}
					    	<input type="hidden" name="answer.${question.id}" value="${f:h(detailContent.questionDetailId)}">
				    		<br>
				    	</c:if>
			    	</c:forEach>
			    </c:if>
		    </c:if>
		</c:forEach>
	</c:forEach>
	<s:submit value="送信" />
</s:form>
</body>
</html>