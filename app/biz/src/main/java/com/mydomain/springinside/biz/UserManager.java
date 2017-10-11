package com.mydomain.springinside.biz;

import com.mydomain.springinside.model.UserVO;

/**
 * @author jyl25609
 * @version Id: UserManager, v 0.1 2017/10/11 20:05 jyl25609 Exp $
 */
public interface UserManager {
    UserVO getUser(String account);
}
