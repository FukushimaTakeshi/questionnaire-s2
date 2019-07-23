package ja.questionnaire.domain.model.question;

import java.util.List;

public class Questions {
    private List<Question> list;

    public Questions(List<Question> list) {
        this.list = list;
    }

    public List<Question> list() { return list; }

    public boolean isRadio(final String id) {
        for (Question question : this.list) {
            if (question.getId().equals(id)) {
                return question.isRadio();
            }
        }
        return false;
    }
    public boolean isText(final String id) {
        for (Question question : this.list) {
            if (question.getId().equals(id)) {
                return question.isText();
            }
        }
        return false;
    }
}
