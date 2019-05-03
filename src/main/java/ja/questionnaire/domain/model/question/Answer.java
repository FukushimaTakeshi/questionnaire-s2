package ja.questionnaire.domain.model.question;

public class Answer {
    private final String value;

    Answer(String value) { this.value = value; }

    @Override
    public String toString() { return this.value; }
}
