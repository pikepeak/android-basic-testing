package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.NameIsEmptyRule;
import cc.somkiat.basicunittesting.rule.NameOnlyEnglishRule;

public class NameValidation {
    UserInfo userInfo;
    public NameValidation(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void nameIsEmpty() throws Exception{
        NameIsEmptyRule nameIsEmptyRule = new NameIsEmptyRule();
        nameIsEmptyRule.validate(userInfo);
    }

    public void nameOnlyEnglish() throws Exception{
        NameOnlyEnglishRule nameOnlyEnglishRule = new NameOnlyEnglishRule();
        nameOnlyEnglishRule.validate(userInfo);
    }
}
