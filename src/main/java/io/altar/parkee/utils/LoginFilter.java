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
import io.altar.parkee.view.RegisterBean;


public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Inject
	RegisterBean registerBean;
	
	@Inject
	AccountBean accountBean;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		
		String url = req.getRequestURI();
		
//		System.out.println(accountBean.getAccount().getId());
//		System.out.println(accountBean.getAccount().getEmail());
//		System.out.println(accountBean.getAccount().getPassword());
		
		if (accountBean == null || !accountBean.getAccount().isLoggedIn()){
		
			//Se a sessao for nula e tentar aceder a certas paginas, segue para o Login para o utilizador se autenticar
			if(url.indexOf("index.xhtml") >= 0 || url.indexOf("overviewUser.xhtml") >= 0){
				resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
				
			} else{
				chain.doFilter(request, response);
			}
		} else {
			
			//Se a sessao for autenticada e tentar ir ao login / registar, redirecciona para o customer page(?)
			
			if (url.indexOf("logout.xhtml") >= 0) {
				req.getSession().removeAttribute("AccountBean");
				resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
			} else {
				chain.doFilter(request, response);
			}
		}
		
		
		if (registerBean.getNewAccount().isRegistered()) {
			resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
		}

		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
