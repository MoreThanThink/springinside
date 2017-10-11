package com.mydomain.springinside.dal.user;

import java.util.List;

import com.mydomain.springinside.dal.user.model.UserDO;

/**
 * 用户接口
 * 
 * @author jyl25609
 * @version Id: User, v 0.1 2017/10/11 19:52 jyl25609 Exp $
 */
public interface User {
    /**
     * 获取所有用户
     *
     * @return 所有用户
     */
    List<UserDO> getAllUsers();

    /**
     * 根据账号查询用户
     *
     * @param account account
     * @return 用户
     */
    UserDO getUserByAccount(String account);
}
