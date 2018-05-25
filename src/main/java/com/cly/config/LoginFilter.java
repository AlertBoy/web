package com.cly.config;

import com.cly.model.YellowMan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = "/login.json",filterName = "loginFilter")
@Order(value = 2)
public class LoginFilter extends BaseFilter  implements Filter {
	@Override
	public void destroy() {
		log.info("destroy {}", getClass()); 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String basePath = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+req.getContextPath();
		boolean noNeedLoginPaths = NO_NEED_LOGIN_PATHS.contains(req.getRequestURL().substring(basePath.length()));  
		if(noNeedLoginPaths){
			filterChain.doFilter(request, response); 
			return;
		}
		YellowMan loginSession = (YellowMan) req.getSession(true).getAttribute("loginUser");
		if(loginSession!=null){
			filterChain.doFilter(request, response); 
		}else{
			res.sendRedirect("/user/login");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		log.info("init {}",getClass());
		
	}
}
