package com.code.Web;

import com.code.DAO.DoctorDAO;
import com.code.Model.Doctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doctor")
public class DoctorServlet extends HttpServlet {
    private DoctorDAO doctorDAO = new DoctorDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Doctor> doctors = doctorDAO.getAllDoctors();
        request.setAttribute("doctors", doctors);
        request.getRequestDispatcher("WEB-INF/views/doctors.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String adresse = request.getParameter("adresse");
        String phone = request.getParameter("phone");

        Doctor doctor = new Doctor(name, adresse, phone);
        doctorDAO.addDoctor(doctor);

        response.sendRedirect("doctor-dashboard.jsp"); // Refresh list after adding
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        doctorDAO.deleteDoctor(id);
        response.sendRedirect("doctor");
    }
}
