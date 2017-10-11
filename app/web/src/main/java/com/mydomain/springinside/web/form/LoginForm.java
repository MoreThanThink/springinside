package com.mydomain.springinside.web.form;

import java.io.Serializable;

/**
 * 登录表单
 *
 * @author jyl25609
 * @version Id: LoginForm, v 0.1 2017/10/11 19:29 jyl25609 Exp $
 */
public class LoginForm implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 用户名 */
    private String            username;

    /** 密码 */
    private String            password;

    /** 验证码 */
    private String            code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
