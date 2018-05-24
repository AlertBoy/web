package com.cly.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = "/login.json", filterName = "corsFilter")
@Order(value = 1)
	public class CorsFilter extends BaseFilter implements Filter {
	@Override
	public void destroy() {
		log.info("destroy {}", getClass());
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		log.info("requestURL={}:{}",req.getMethod(), req.getRequestURL());
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
		res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
		res.setHeader("Access-Control-Max-Age", "0");
		res.setHeader( "sdwdwd","2");
		res.setHeader(
				"Access-Control-Allow-Headers",
				"Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		res.setHeader("XDomainRequestAllowed", "1");
		if (req.getMethod().equals("OPTIONS")) {
			res.setStatus(200);
			return;
		}
		filterChain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		log.info("init {}", getClass());

	}
}
