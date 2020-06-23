package org.example.ford.servlet;

import org.example.ford.dto.Motor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");


//		if (request.getParameter("button1") != null) {
//		} else if (request.getParameter("button2") != null) {
//		} else if (request.getParameter("button3") != null) {
//		} else {
//		}
		int page = 1;
		int recordsPerPage = 5;
		if(request.getParameter("page") != null)
			page = Integer.parseInt(request.getParameter("page"));
//		EmployeeDAO dao = new EmployeeDAO();
//		List<Employee> list = dao.viewAllEmployees((page-1)*recordsPerPage,
//				recordsPerPage);
//		int noOfRecords = dao.getNoOfRecords();
//		int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);


		List<Motor> motors = Arrays.asList(new Motor(455, "22"), new Motor(44, "2121"));
		request.setAttribute("motors", motors);
//		request.setAttribute("noOfPages", noOfPages);
		request.setAttribute("noOfPages", 10);
		request.setAttribute("currentPage", page);
//		RequestDispatcher view = request.getRequestDispatcher("employee.jsp");
//		view.forward(request, response);

		request.getRequestDispatcher("/output.jsp").forward(request, response);
	}

}