package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.EmailIsEmptyRule;
import cc.somkiat.basicunittesting.validation.EmailValidation;
import cc.somkiat.basicunittesting.validation.NameValidation;

import static junit.framework.Assert.assertTrue;

public class EmailValidationTest {
    @Test(expected = EmailIsEmptyRule.class)
    public void emailIsEmpty() throws Exception{
        String email = "";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.emailIsEmpty();
    }

    @Test
    public void emailIsNotEmpty() throws Exception{
        String email = "ASDASDSACSAZC12312rfaefdadsfE41231!@#!@#!@$!23123";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when enail is not empty", emailValidation.emailIsEmpty());
    }
}
