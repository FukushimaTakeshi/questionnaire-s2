package ja.questionnaire.domain.model.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionsAndAnswers {
    private final User user;
    private final Map<Question, Answer> values;

    public QuestionsAndAnswers(final String name, final Map<String, String> answers, List<Question> questions) {
        this.user = new User(name);
        this.values = attributes(answers, questions);
    }

    private Map<Question, Answer> attributes(Map<String, String> answers, List<Question> questions) {
        Map<Question, Answer> map = new HashMap<>();
        for(Question question : questions) {
            for(Map.Entry<String, String> answerMap : answers.entrySet()) {
                if (answerMap.getKey().equals(question.getId())) {
                    map.put(question, new Answer(answerMap.getValue()));
                }
            }
        }
        return map;
    }

    public String userName() { return user.toString(); }
    public String getName() { return user.toString(); }
    public Map<Question, Answer> questionsAndAnswers() { return values; }

    public Map<String, String> getQuestionsAndAnswers() {
        Map<String, String> map = new HashMap<>();
        for(Map.Entry<Question, Answer> value : values.entrySet()) {
            map.put(value.getKey().getId(), value.getValue().toString());
        }
        return map;
    }
}
