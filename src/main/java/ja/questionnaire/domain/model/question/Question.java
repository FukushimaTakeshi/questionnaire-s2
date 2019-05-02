package ja.questionnaire.domain.model.question;


import org.seasar.framework.beans.util.BeanMap;

import java.util.List;

public class Question {
    private final String id;
    private final String type;
    private final String content;
    private final List<BeanMap> detailContent;

    public Question(final String id, final String type, final String content, final List<BeanMap> detailContent) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.detailContent = detailContent;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public String getContent() { return content; }
    public List<BeanMap> getDetailContent() { return detailContent; }
}
