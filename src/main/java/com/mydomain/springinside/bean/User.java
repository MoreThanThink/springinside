package com.mydomain.springinside.bean;

/**
 * @author jyl25609
 * @version Id: User, v 0.1 2017-10-09 14:23:39 jyl25609 Exp $
 */
public class User {
    private String name;

    private String gender;

    private int    age;

    /**
     * name getter
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * name setter
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gender getter
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * gender setter
     *
     * @param gender gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * age getter
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * age setter
     *
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
