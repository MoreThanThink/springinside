package com.mydomain.springinside.model;

/**
 * UserVO
 *
 * @author jyl25609
 * @version Id: UserVO, v 0.1 2017/10/11 20:06 jyl25609 Exp $
 */
public class UserVO {
    private int    id;
    private String account;
    private String name;
    private int    age;
    private String gender;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserVO{" + "id=" + id + ", account='" + account + '\'' + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + '}';
    }
}
