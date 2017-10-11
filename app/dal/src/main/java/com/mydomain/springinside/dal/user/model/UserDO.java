package com.mydomain.springinside.dal.user.model;

/**
 * UserDO
 *
 * @author jyl25609
 * @version Id: UserDO, v 0.1 2017/10/11 19:48 jyl25609 Exp $
 */
public class UserDO {
    /** id */
    private int    id;

    /** 账号 */
    private String account;

    /** 密码 */
    private String password;

    /** 姓名 */
    private String name;

    /** 性别 */
    private String gender;

    /** 年龄 */
    private int    age;

    /** 等级 */
    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
