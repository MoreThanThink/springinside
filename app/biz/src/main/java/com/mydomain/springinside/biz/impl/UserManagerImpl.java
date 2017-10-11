package com.mydomain.springinside.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mydomain.springinside.biz.UserManager;
import com.mydomain.springinside.dal.user.User;
import com.mydomain.springinside.dal.user.model.UserDO;
import com.mydomain.springinside.model.UserVO;

/**
 * @author jyl25609
 * @version Id: UserManagerImpl, v 0.1 2017/10/11 20:06 jyl25609 Exp $
 */
@Service("userManager")
public class UserManagerImpl implements UserManager {
    @Resource
    private User user;

    @Override
    public UserVO getUser(String account) {
        UserDO userDO = user.getUserByAccount(account);
        return convert(userDO);
    }

    private UserVO convert(UserDO userDO) {
        if (userDO == null) {
            return null;
        }

        UserVO userVO = new UserVO();
        userVO.setId(userDO.getId());
        userVO.setAccount(userDO.getAccount());
        userVO.setName(userDO.getName());
        userVO.setAge(userDO.getAge());
        userVO.setGender(userDO.getGender());
        return userVO;
    }
}
