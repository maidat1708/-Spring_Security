package main.security.Validation.Class;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import main.security.Validation.Interface.IIsCharacterUppercased;

public class IsCharacterUppercased implements ConstraintValidator<IIsCharacterUppercased,String> {
    private int maxLength;

    @Override
    public void initialize(IIsCharacterUppercased username) {
        this.maxLength = username.maxLength();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean valid = true;

        if (value == null || value.isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("USERNAME_EMPTY")
                   .addConstraintViolation();
            valid = false;
        }
        else if(!value.matches(".*[A-Z].*")) {
            valid = false;
        }
        else if (value.length() > maxLength) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("USERNAME_TOO_LONG")
                   .addConstraintViolation();
            valid = false;
        }
        return valid;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
