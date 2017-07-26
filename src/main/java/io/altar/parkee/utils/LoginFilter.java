package io.altar.parkee.utils;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.altar.parkee.view.AccountBean;


public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	@Inject
	AccountBean accountBean;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		accountBean = (AccountBean) req.getSession().getAttribute("AccountBean");
		String url = req.getRequestURI();
		
		if (accountBean.getAccount() == null || !accountBean.getAccount().isLoggedIn()){
			System.out.println("sem sessao");
			//Se a sessao for nula e tentar aceder a certas paginas, segue para o Login para o utilizador se autenticar
			if(url.indexOf("index.xhtml") >= 0 || url.indexOf("userConsole.xhtml") >= 0){
				resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
			} else{
				chain.doFilter(request, response);
			}
		} else {
			System.out.println("com sessao");
			//Se a sessao for autenticada e tentar ir ao login / registar, redirecciona para o customer page(?)
			if(url.indexOf("login.xhtml") >= 0 || url.indexOf("register.xhtml") >= 0){
				resp.sendRedirect(req.getServletContext().getContextPath() + "/userConsole.xhtml");
			} else if (url.indexOf("logout.xhtml") >= 0) {
				req.getSession().removeAttribute("AccountBean");
				resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
			} else {
				chain.doFilter(request, response);
			}
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
