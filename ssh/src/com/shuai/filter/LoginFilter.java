package com.shuai.filter;

import org.aopalliance.intercept.Interceptor;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.shuai.domain.User;

public class LoginFilter implements Interceptor {
	// 编写拦截器，需要实现Interceptor接口，实现接口中的三个方法
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        // 获取session对象
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
        if(user == null){
            // 说明，没有登录，后面就不会执行了
            return "tologin";
        }
        return invocation.invoke();
    }

}
