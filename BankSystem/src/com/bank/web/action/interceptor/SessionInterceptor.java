package com.bank.web.action.interceptor;

import java.util.Map;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.bank.domain.UserInfo;
import com.opensymphony.xwork2.ActionInvocation;
public class SessionInterceptor extends AbstractInterceptor {
	private static final Object LOGIN_KEY="user";
	private static final String LOGIN_PAGE="loginPage";
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		Map session=actionInvocation.getInvocationContext().getSession();
		UserInfo userInfo=(UserInfo)session.get(LOGIN_KEY);
		if(userInfo!=null){
			return actionInvocation.invoke();
		}
		else{
			return LOGIN_PAGE;
		}
	}

}
