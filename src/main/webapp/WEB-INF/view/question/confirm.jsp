<%@page pageEncoding="UTF-8"%>

<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
    <tiles:put name="content" type="string">
  
        <section class="hero is-info is-medium is-bold">
            <div class="hero-body">
                <div class="container has-text-centered">
                    <h1 class="title">アンケートだよ</h1>
                </div>
            </div>
        </section>
        <div class="container">
            <section class="articles">
                <div class="column is-8 is-offset-2">
                    <div class="card article">	
                        <div class="card-content">
                            <div class="media">
                                <div class="media-content has-text-centered">
                                    <p class="title article-title">勉強会アンケートだよ</p>
                                    <div class="tags has-addons level-item">
                                        <span class="tag is-rounded is-info">@oreno enquete</span>
                                        <span class="tag is-rounded">v 1.0.0</span>
                                    </div>
                                </div>
                            </div>
                            <html:errors />
                            <s:form action="create/?questionnaireId=${f:u(form.questionnaireId)}" method="POST">
                                <div class="content article-body">
                                    <div class="field">
                                        <label class="label">名前</label>
                                        <div class="control">
                                            <c:out value="${questionsAndAnswers.name}"/>
                                            <input type="hidden" name="name" value="${f:h(questionsAndAnswers.name)}"/>
                                        </div>
                                    </div>
                                </div>
                                <hr>
                                
                                <c:forEach var="question" items="${questions}" varStatus="status">
                                    <div class="field">
                                        <label class="label">Q.<c:out value="${question.id}"/></label>
                                        <p><c:out value="${question.content}"/></p>
                                        <p></p>

                                        <div class="control">
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
                                        </div>
                                    </div>
                                </c:forEach>
                                <div class="field">
                                    <div class="control">
                                        <s:submit value="送信するよ" styleClass="button is-block is-info is-fullwidth" />
                                    </div>
                                </div>
                            </s:form>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </tiles:put>
</tiles:insert>