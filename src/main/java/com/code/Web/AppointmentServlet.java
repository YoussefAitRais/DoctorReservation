package com.code.Web;

import com.code.DAO.AppointmentDAO;
import com.code.Model.Appointment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@WebServlet("/appointment")
public class AppointmentServlet extends HttpServlet {
    private AppointmentDAO appointmentDAO = new AppointmentDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Appointment> appointments = appointmentDAO.getAllAppointments();
        request.setAttribute("appointments", appointments);
        request.getRequestDispatcher("WEB-INF/views/appointments.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Time time = Time.valueOf(request.getParameter("time"));
        Date date = Date.valueOf(request.getParameter("date"));
        int patientID = Integer.parseInt(request.getParameter("patientID"));
        int doctorID = Integer.parseInt(request.getParameter("doctorID"));

        Appointment appointment = new Appointment(time, date, patientID, doctorID);
        appointmentDAO.addAppointment(appointment);

        response.sendRedirect("appointment");
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        appointmentDAO.deleteAppointment(id);
        response.sendRedirect("appointment");
    }
}
