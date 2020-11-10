package com.xiaowei.feihu.shiro;

import com.xiaowei.feihu.entity.TestUser;
import com.xiaowei.feihu.service.userService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomRealm extends AuthorizingRealm {
    @Autowired
    private userService userservice;

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();
        TestUser user = userservice.getUserInfoByUserName(userName);
        if (user != null) {
            AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
                    user,
                    user.getPassword(),
                    ByteSource.Util.bytes(user.getSaltCode()),
                    getName()
            );
            return authenticationInfo;
        }else{
            throw new UnknownAccountException();
        }
    }
}
