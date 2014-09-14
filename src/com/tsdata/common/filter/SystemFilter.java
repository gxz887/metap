package com.tsdata.common.filter;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.http.HttpStatus;  

import com.tsdata.base.entity.UserExt;

import javax.servlet.*;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  

import java.io.IOException;  
public class SystemFilter implements Filter {  
	  
    Logger logger = LoggerFactory.getLogger(SystemFilter.class);  
  
  
    @Override  
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {  
        if (!(servletRequest instanceof HttpServletRequest) || !(servletResponse instanceof HttpServletResponse)) {  
            throw new ServletException("OncePerRequestFilter just supports HTTP requests");  
        }  
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;  
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;  
        HttpSession session = httpRequest.getSession(true);  
        Object object = session.getAttribute("user");  
        UserExt user = object == null ? null : (UserExt) object;  
        System.out.println(user);
        if (user == null) {  
        	if(!httpRequest.getRequestURI().contains("login")) {
        		System.out.println(httpRequest.getRequestURI());
	            httpResponse.sendRedirect(httpRequest.getContextPath()+"/login.jsp");  
	            return;  
        	}
        }
        /*
        else{
        	  httpResponse.sendRedirect(httpRequest.getContextPath()+"/index.jsp");  
        	  return;
        }*/
        filterChain.doFilter(servletRequest, servletResponse);  
        return;  
    }  
  
    @Override  
    public void init(FilterConfig filterConfig) throws ServletException {  
            /*如果需要注入，请取消注释*/  
//           ServletContext servletContext = filterConfig.getServletContext();  
//            WebApplicationContext applicationContext = (WebApplicationContext) servletContext.  
//                    getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);  
//            if (null == topConstantsImpl) {  
//                //从Spring AC 中加载app configuration对象  
//                topConstantsImpl = applicationContext.getBean(TopConstantsImpl.class);  
//        }  
    }  
  
    @Override  
    public void destroy() {  
        //To change body of implemented methods use File | Settings | File Templates.  
    }  
  
  
}  
