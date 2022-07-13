/**
 * 
 */
package com.i3tv.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 4884978731059079399L;

	Integer contador;
	/*
	 * En este ejercicio se debe cumplir: 
	 * 1. El servlet debe recibir peticiones GET en la url: http://localhost:8080/
	 * 2. Debe contar cada
	 * petición y devolver el valor actual.
	 */

	public void init() throws ServletException {
		contador = 0;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + (contador++) + "</h1>");
	}
}
