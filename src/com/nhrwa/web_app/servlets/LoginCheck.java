package com.nhrwa.web_app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhrwa.web_app.CRUD.BasicCRUDService;
import com.nhrwa.web_app.entity.User;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 *
	 * @throws ImproperEntityException
	 */
	public LoginCheck() {
		BasicCRUDService<User> service = null;
		try {
			service = new BasicCRUDService<User>(User.class);
		} catch (ImproperEntityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.findAll();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
