package com.example.servletjspdemo;

import dao.AlienDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Alien;

import java.io.IOException;

@WebServlet(name = "GetAlienController", value = "/getAlien")
public class GetAlienController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int aid=Integer.parseInt(request.getParameter("aid"));
        AlienDao dao = new AlienDao();
        Alien alien1 = dao.getAlien(aid);

        HttpSession session = request.getSession();
        session.setAttribute("alien",alien1);
        response.sendRedirect("showAlien.jsp");

//        request.setAttribute("alien",alien1);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("showAlien.jsp");
//        requestDispatcher.forward(request,response);
    }


}
