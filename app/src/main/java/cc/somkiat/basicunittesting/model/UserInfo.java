package cc.somkiat.basicunittesting.model;

import java.util.Date;

public class UserInfo {
    public String name;
    public Date birthday;
    public String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserInfo(String name) {
        this.name = name;
    }
}
