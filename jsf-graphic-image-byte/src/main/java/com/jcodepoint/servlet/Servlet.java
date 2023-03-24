package com.jcodepoint.servlet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/image/*")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String f = request.getPathInfo().substring(1);
		String filename = request.getServletContext().getRealPath("resources/images/" + f);

		File imageFile = new File(filename);
		byte[] bytes = Files.readAllBytes(imageFile.toPath());

		response.setHeader("Content-Disposition", "inline;filename=\"imageFileName.jpg\"");
		response.setContentType("image/jpeg");
		response.setContentLength(bytes.length);
		response.getOutputStream().write(bytes);		
	}
}
