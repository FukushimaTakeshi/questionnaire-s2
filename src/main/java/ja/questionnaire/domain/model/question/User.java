package ja.questionnaire.domain.model.question;

public class User {
    private final String value;

    User(String value) { this.value = value; }

    @Override
    public String toString() {
        return value;
    }
}
