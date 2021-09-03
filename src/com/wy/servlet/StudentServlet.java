package com.wy.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wy.entity.School;
import com.wy.service.ServiceSchool;
import com.wy.service.impl.ServiceSchooltImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/search")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String sname = req.getParameter("sname");
        ServiceSchool serviceSchool = new ServiceSchooltImpl();
        List<School> list = serviceSchool.getSchoolbyName(sname);
       if(list.size()>0){
           ObjectMapper mapper = new ObjectMapper();
           String json = mapper.writeValueAsString(list);
           PrintWriter out = resp.getWriter();
           out.print(json);
           out.close();
       }
    }
}
