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
                            <s:form action="confirm/?questionnaireId=${f:u(form.questionnaireId)}" method="POST">
                                <div class="content article-body">
                                    <div class="field">
                                        <label class="label">名前</label>
                                        <div class="control">
                                            <html:text property="name" styleClass="input"/>
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
                                            <c:if test="${question.type == 0001}">
                                                <textarea name="answer.${question.id}" class="textarea">${f:h(answer.question.id)}</textarea>
                                            </c:if>

                                            <c:if test="${question.type == 0002}">
                                                <c:forEach var="detailContent" items="${question.detailContent}">
                                                    <div class="field">
                                                        <label class="radio">
                                                            <input type="radio" name="answer.${question.id}" value="${f:h(detailContent.questionDetailId)}">
                                                            <c:out value="${detailContent.questionDetailContent}"/>
                                                        </label>
                                                    </div>
                                                </c:forEach>
                                            </c:if>
                                        </div>
                                    </div>
                                </c:forEach>
                                <div class="field">
                                    <div class="control">
                                        <s:submit value="確認するよ" styleClass="button is-block is-info is-fullwidth" />
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