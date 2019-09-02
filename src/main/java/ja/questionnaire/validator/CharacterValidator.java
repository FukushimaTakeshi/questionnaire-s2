package ja.questionnaire.validator;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.Resources;

import javax.servlet.http.HttpServletRequest;

public class CharacterValidator {

    public static boolean validateHalfAndFullMaxLength(Object bean,
                                    ValidatorAction validatorAction,
                                    Field field,
                                    ActionMessages errors,
                                    Validator validator,
                                    HttpServletRequest request) {
        final String value = ValidatorUtils.getValueAsString(bean, field.getProperty());
        if (GenericValidator.isBlankOrNull(value)) { return true; }

        final int max = Integer.parseInt(field.getVarValue("maxlength"));
        int count = 0;

        final char[] chars = value.toCharArray();
        for (final char ch : chars) {
            if (String.valueOf(ch).getBytes().length <= 1) {
                count += 1;
            } else {
                count += 2;
            }
        }
        if (count >= max) {
            errors.add(field.getKey(), Resources.getActionMessage(validator, request, validatorAction, field));
            return false;
        }
        return true;
    }
}
