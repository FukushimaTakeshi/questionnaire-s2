package ja.questionnaire.domain.model.question;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.validator.GenericValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionsAndAnswers {
    private final User user;
    private final Map<Question, Answer> values;
    private final List<String> errors;

    public QuestionsAndAnswers(final String name, final Map<String, String> answers, final Questions questions) {
        this.user = new User(name);
        this.errors = validate(answers, questions);
        this.values = attributes(answers, questions);
    }

    private List<String> validate(Map<String, String> answers, final Questions questions) {
        List<String> errors = new ArrayList<>();

        for (Question question : questions.list()) {
            // ラジオボタンが未選択の場合はanswerのvalueが空のため、空であればerror
            if (!answers.containsKey(question.getId())) {
                errors.add("未回答の質問があります");
            }
        }

        for (Map.Entry<String, String> answerMap : answers.entrySet()) {
            if (StringUtils.isEmpty(answerMap.getValue())) {
                errors.add("未回答の質問があります");
            } else if (questions.isRadio(answerMap.getKey()) &&
                    (!NumberUtils.isNumber(answerMap.getKey()) || !NumberUtils.isNumber(answerMap.getValue()))) {
                errors.add("不正な値があります");
            } else if (questions.isText(answerMap.getKey()) &&
                    !GenericValidator.maxLength(answerMap.getValue(), 10)) {
                errors.add("回答内容の長さが最大値(10)を超えています");
            }
        }
        return errors;
    }

    private Map<Question, Answer> attributes(Map<String, String> answers, Questions questions) {
        Map<Question, Answer> map = new HashMap<>();
        for(Question question : questions.list()) {
            for(Map.Entry<String, String> answerMap : answers.entrySet()) {
                if (answerMap.getKey().equals(question.getId())) {
                    map.put(question, new Answer(answerMap.getValue()));
                }
            }
        }
        return map;
    }

    public List<String> errors() { return errors; }

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
