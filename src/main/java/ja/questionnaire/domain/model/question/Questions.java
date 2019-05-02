package ja.questionnaire.domain.model.question;

import java.util.List;

public class Questions {
    private List<Question> list;

    public Questions(List<Question> list) {
        this.list = list;
    }

    public List<Question> list() { return list; }
}
