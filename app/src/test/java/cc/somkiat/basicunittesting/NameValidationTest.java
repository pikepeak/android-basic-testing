package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.NameIsEmptyRule;
import cc.somkiat.basicunittesting.rule.NameOnlyEnglishRule;
import cc.somkiat.basicunittesting.rule.Rule;
import cc.somkiat.basicunittesting.validation.NameValidation;

import static junit.framework.Assert.assertTrue;

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
        String name = "peak!@!#!@#^__()";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }
    @Test
    public void nameIsNotEmpty() throws Exception {
        String name = "peak21515#!@#%^#$%^&*_*()&";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("`true` when Name is not empty", nameValidation.nameIsEmpty());
    }

    @Test
    public void nameOnlyEnglish() throws Exception {
        String name = "peak";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("`true` when Name is OnlyEnglish", nameValidation.nameOnlyEnglish());
    }

    @Test
    public void nameIsAcceptable() throws Exception {
        String name = "peakinwza";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("`true` when Name is Acceptable", nameValidation.validation());
    }

    @Test(expected = NameIsEmptyRule.class)
    public void nameIsNotAcceptableByEmpty() throws Exception {
        String name = "";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.validation();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void nameIsNotAcceptableByHaveNumber() throws Exception {
        String name = "dasd123";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.validation();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void nameIsNotAcceptableByHaveSymbols() throws Exception {
        String name = "dasd_#@!%!#";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.validation();
    }
}
