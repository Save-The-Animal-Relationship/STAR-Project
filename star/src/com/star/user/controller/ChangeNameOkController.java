package com.star.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Result;
import com.star.user.dao.UserDAO;
import com.star.user.domain.UserVO;

public class ChangeNameOkController {
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		UserDAO userDAO = new UserDAO();
		Result result = new Result();
		userDAO.updateName(req.getParameter("userName"),1L);  
//		userVO.setUserNumber(Long.valueOf(req.getParameter("userNumber")));
		
		
		result.setRedirect(true);
		result.setPath("myInfo.user");
		
		
		
		return result;
	}
}
