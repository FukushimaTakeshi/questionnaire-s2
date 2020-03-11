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
                                    <div class="content article-body">
                                        <div class="field">
                                            <label class="label">送信しました！</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </tiles:put>
</tiles:insert>