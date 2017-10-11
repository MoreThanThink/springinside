package com.mydomain.springinside.dal.user.impl;

import java.util.List;
import java.util.Optional;

import com.mydomain.springinside.dal.user.User;
import com.mydomain.springinside.dal.user.model.UserDO;
import com.mydomain.springinside.dal.user.util.UsersUtil;

/**
 * 用户信息
 *
 * @author jyl25609
 * @version Id: UserImpl, v 0.1 2017/10/11 19:54 jyl25609 Exp $
 */
public class UserImpl implements User {

    private List<UserDO> users;

    public UserImpl(List<UserDO> users) {
        this.users = UsersUtil.getUsers();
    }

    @Override
    public List<UserDO> getAllUsers() {
        return users;
    }

    @Override
    public UserDO getUserByAccount(String account) {
        if (users == null || users.size() == 0) {
            return null;
        }

        Optional<UserDO> optional = users.stream().filter(u -> u.getAccount().equalsIgnoreCase(account)).findFirst();
        if (optional.isPresent()) {
            return optional.get();
        }

        return null;
    }
}
