package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.NameIsEmptyRule;
import cc.somkiat.basicunittesting.rule.NameOnlyEnglishRule;
import cc.somkiat.basicunittesting.rule.Rule;
import cc.somkiat.basicunittesting.validation.NameValidation;

public class NameValidationTest {

    @Test(expected = NameIsEmptyRule.class)
    public void nameIsEmpty() throws Exception {
        String name = "";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameIsEmpty();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void nameHaveNumber() throws Exception {
        String name = "peak3";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void nameHaveSymbols() throws Exception {
        String name = "peak!@!#!@#^()";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }
}
