package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.EmailIsEmptyRule;

public class EmailValidation {
    UserInfo userInfo;
    public EmailValidation(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public boolean emailIsEmpty() throws Exception{
        EmailIsEmptyRule emailIsEmptyRule = new EmailIsEmptyRule();
        return emailIsEmptyRule.validate(userInfo);
    }
}
