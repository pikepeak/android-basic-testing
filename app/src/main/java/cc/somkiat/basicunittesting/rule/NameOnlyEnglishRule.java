package cc.somkiat.basicunittesting.rule;

import cc.somkiat.basicunittesting.model.UserInfo;

public class NameOnlyEnglishRule extends Exception implements Rule{
    public NameOnlyEnglishRule() {

    }

    public NameOnlyEnglishRule(String s) {
        super(s);
    }

    @Override
    public boolean validate(UserInfo user) throws Exception {
        if (user.getName().matches(".*\\d+.*")){
            throw new NameOnlyEnglishRule("Name Only English.");
        }
        return true;
    }
}
