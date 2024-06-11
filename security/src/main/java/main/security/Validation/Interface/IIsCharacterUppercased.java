package main.security.Validation.Interface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import main.security.Validation.Class.IsCharacterUppercased;

@Constraint(validatedBy = IsCharacterUppercased.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface IIsCharacterUppercased {
    
    String message() default "USERNAME_NOT_UPPERCASED";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int maxLength() default Integer.MAX_VALUE;
    
}
