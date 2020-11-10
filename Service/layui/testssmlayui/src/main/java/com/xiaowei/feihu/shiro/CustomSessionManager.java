package com.xiaowei.feihu.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.session.mgt.WebSessionKey;

import javax.servlet.ServletRequest;
import java.io.Serializable;

//对shiro 所有的session处理
public class CustomSessionManager extends DefaultWebSessionManager {

//
    @Override
    protected Session retrieveSession(SessionKey sessionKey) throws UnknownSessionException {
        Serializable sessionid = (Serializable) getSession(sessionKey);
        ServletRequest request = null;
        if(sessionid instanceof WebSessionKey){
            request = ((WebSessionKey)sessionKey).getServletRequest();
        }
        if(request != null && sessionid != null){
            Session session = (Session) request.getAttribute(sessionid.toString());
            if(session !=null){
                return session;
            }
        }
        //从redis中取出session
        Session session = super.retrieveSession(sessionKey);
        if (request != null && sessionid != null) {
            request.setAttribute(sessionid.toString(), session);
        }
        return  session;
    }
}
