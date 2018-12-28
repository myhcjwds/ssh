package com.shuai.filter;

import org.aopalliance.intercept.Interceptor;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.shuai.domain.User;

public class LoginFilter implements Interceptor {
	// ��д����������Ҫʵ��Interceptor�ӿڣ�ʵ�ֽӿ��е���������
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        // ��ȡsession����
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
        if(user == null){
            // ˵����û�е�¼������Ͳ���ִ����
            return "tologin";
        }
        return invocation.invoke();
    }

}
