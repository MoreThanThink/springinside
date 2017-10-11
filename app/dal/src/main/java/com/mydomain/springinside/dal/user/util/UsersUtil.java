package com.mydomain.springinside.dal.user.util;

import java.util.ArrayList;
import java.util.List;

import com.mydomain.springinside.dal.user.model.UserDO;

/**
 * 用户工具
 *
 * @author jyl25609
 * @version Id: UsersUtil, v 0.1 2017/10/11 19:55 jyl25609 Exp $
 */
public class UsersUtil {
    private static List<UserDO> users;

    static {
        users = new ArrayList<>();
    }

    public static List<UserDO> getUsers() {
        return users;
    }
}
