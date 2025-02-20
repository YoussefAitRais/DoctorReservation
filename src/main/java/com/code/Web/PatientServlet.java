package com.code.Web;

import com.code.DAO.PatientDAO;
import com.code.Model.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
    private PatientDAO patientDAO = new PatientDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Patient> patients = patientDAO.getAllPatients();
        request.setAttribute("patients", patients);
        request.getRequestDispatcher("patients.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String adresse = request.getParameter("adresse");

        Patient patient = new Patient(name, phone, adresse);
        patientDAO.addPatient(patient);

        response.sendRedirect("aappointment.jsp");
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        patientDAO.deletePatient(id);
        response.sendRedirect("patient-dashboard.jsp");
    }
}
