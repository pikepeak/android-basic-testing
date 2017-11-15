package cc.somkiat.basicunittesting;

import org.junit.Test;

import java.util.Date;

import cc.somkiat.basicunittesting.model.UserInfo;

import static org.junit.Assert.assertEquals;

public class UserInfoTest {

    @Test
    public void UserInfoTestConGetSetOnlyName() throws Exception {
        String name = "peak";
        UserInfo userInfo = new UserInfo(name);
        assertEquals("peak", userInfo.getName());
        userInfo.setName("Hello");
        assertEquals("Hello", userInfo.getName());
    }

    @Test
    public void UserInfoTestConGetSetOnlyNameandEmail() throws Exception {
        String name = "peak";
        String email = "khunach@hotmail.com";
        UserInfo userInfo = new UserInfo(name, email);
        assertEquals("peak", userInfo.getName());
        assertEquals("khunach@hotmail.com", userInfo.getEmail());
        userInfo.setName("Hello");
        userInfo.setEmail("khunach@hot.com");
        assertEquals("Hello", userInfo.getName());
        assertEquals("khunach@hot.com", userInfo.getEmail());
    }

    @Test
    public void UserInfoTestConGetSet(){
        String name = "peak";
        String email = "khunach@hotmail.com";
        Date date = new Date(1997, 5, 17);
        UserInfo userInfo = new UserInfo(name, date, email);
        assertEquals("peak", userInfo.getName());
        assertEquals("khunach@hotmail.com", userInfo.getEmail());
        assertEquals(date, userInfo.getBirthday());
        date = new Date(2000, 5, 17);
        userInfo.setName("Hello");
        userInfo.setEmail("khunach@hot.com");
        userInfo.setBirthday(date);
        assertEquals("Hello", userInfo.getName());
        assertEquals("khunach@hot.com", userInfo.getEmail());
        assertEquals(date, userInfo.getBirthday());
    }
}
