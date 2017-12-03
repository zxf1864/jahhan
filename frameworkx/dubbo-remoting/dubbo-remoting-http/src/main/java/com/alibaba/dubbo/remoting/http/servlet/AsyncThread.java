package com.alibaba.dubbo.remoting.http.servlet;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.dubbo.common.utils.AfterWriteHandlerHelper;
import com.alibaba.dubbo.remoting.http.HttpHandler;

import lombok.Setter;
import net.jahhan.context.BaseContext;
import net.jahhan.context.VariableContext;

/**
 * 接口异步线程方法
 * 
 * @author nince
 */
public class AsyncThread implements Runnable {
	@Setter
	private HttpServletRequest request;
	@Setter
	private HttpServletResponse response;
	@Setter
	private HttpHandler handler;
	@Setter
	private AsyncContext asyncCtx;

	@Override
	public void run() {
		VariableContext variableContext = new VariableContext();
		BaseContext.CTX.getThreadLocalUtil().openThreadLocal(variableContext);
		try {
			if (handler == null) {// service not found.
				response.sendError(HttpServletResponse.SC_NOT_FOUND, "Service not found.");
			} else {
				handler.handle(request, response);
			}
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		} finally {
			asyncCtx.complete();
			AfterWriteHandlerHelper.getAllHandler().exec();
		}
	}
}
