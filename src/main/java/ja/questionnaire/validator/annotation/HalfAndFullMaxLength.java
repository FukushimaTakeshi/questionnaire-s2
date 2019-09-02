package ja.questionnaire.validator.annotation;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Validator;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Validator("halfAndFullMaxLength")
public @interface HalfAndFullMaxLength {

    int maxlength();

    Msg msg() default @Msg(key = "errors.maxlength");

    Arg arg0() default @Arg(key = "");

    Arg arg1() default @Arg(key = "${var:maxlength}", resource = false);

    String target() default "";
}