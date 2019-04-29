package ja.questionnaire.domain.model.question;

import java.util.List;

public class Questionnaires {
    private final List<Questionnaire> list;

    public Questionnaires(List<Questionnaire> list) { this.list = list; }

    public List<Questionnaire> list() { return list; }
}
