package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.EmailIsEmptyRule;
import cc.somkiat.basicunittesting.rule.EmailPatternRule;
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

    @Test(expected = EmailPatternRule.class)
    public void emailWithOutAtSymbol() throws Exception {
        String email = "peak.com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.isEmailPattern();
    }

    @Test(expected = EmailPatternRule.class)
    public void emailWithOutTopDomain() throws Exception {
        String email = "hot@head";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.isEmailPattern();
    }

    @Test(expected = EmailPatternRule.class)
    public void emailIsString() throws Exception {
        String email = "khunachmsncom";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.isEmailPattern();
    }

    @Test
    public void correctEmailPattern() throws Exception {
        String email = "khunach@msn.com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.isEmailPattern());
    }

    @Test
    public void emailIsAcceptable() throws Exception{
        String email = "khunach@msn.com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.validation());
    }

    @Test(expected = EmailIsEmptyRule.class)
    public void emailIsNotAcceptableByEmpty() throws Exception{
        String email = "";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.validation());
    }

    @Test(expected = EmailPatternRule.class)
    public void emailIsNotAcceptableByIsString() throws Exception{
        String email = "asdasdasdas";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.validation());
    }
    @Test(expected = EmailPatternRule.class)
    public void emailIsNotAcceptableByWithOutOnTopDomain() throws Exception{
        String email = "asdasdasdas@hotmail";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.validation());
    }
    @Test(expected = EmailPatternRule.class)
    public void emailIsNotAcceptableByWithOutAtSymbol() throws Exception{
        String email = "asdasdasdashotmail.com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.validation());
    }
    @Test(expected = EmailPatternRule.class)
    public void emailIsNotAcceptableByWrongPosition() throws Exception{
        String email = "a.sdasdasdashotmail@com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.validation());
    }
}
