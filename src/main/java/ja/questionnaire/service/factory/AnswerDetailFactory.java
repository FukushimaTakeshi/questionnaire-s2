package ja.questionnaire.service.factory;

import ja.questionnaire.service.AnswerService;

import java.util.HashMap;
import java.util.Map;

public class AnswerDetailFactory {
    private static Map<String, AnswerService.DetailSelector> types;

    static {
        types = new HashMap<>();
        types.put("0001", new AnswerService.TextDetail());
        types.put("0002", new AnswerService.RadioDetail());
    }

    public static AnswerService.DetailSelector detailByType(String type) {
        return types.get(type);
    }
}
