package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.EmailIsEmptyRule;
import cc.somkiat.basicunittesting.validation.EmailValidation;
import cc.somkiat.basicunittesting.validation.NameValidation;

public class EmailValidationTest {
    @Test(expected = EmailIsEmptyRule.class)
    public void emailIsEmpty() throws Exception{
        String email = "";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.emailIsEmpty();
    }
    
}
