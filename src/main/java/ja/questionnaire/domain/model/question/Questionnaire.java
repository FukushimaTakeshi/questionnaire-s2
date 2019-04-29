package ja.questionnaire.domain.model.question;

public class Questionnaire {
    private final String id;
    private final String name;

    public Questionnaire(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
