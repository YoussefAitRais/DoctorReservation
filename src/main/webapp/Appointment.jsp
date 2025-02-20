<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.code.Model.Doctor" %>

<%@ page import="com.code.DAO.DoctorDAO" %>
<%
    DoctorDAO doctorDAO = new DoctorDAO();
    List<Doctor> doctors = doctorDAO.getAllDoctors();
%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prendre un Rendez-vous</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-cover bg-center h-screen flex items-center justify-center min-h-screen" style="background-image: url('./image/reservation.jpg')">
<div class="bg-white p-8 rounded-lg shadow-lg w-full max-w-md">
    <h2 class="text-2xl font-bold text-center text-blue-600 mb-6">Prendre un Rendez-vous</h2>

    <form action="appointment" method="post" class="space-y-4">
        <input type="text" name="username" placeholder="Nom complet" required class="w-full px-4 py-2 border rounded-lg">
        <input type="email" name="email" placeholder="Email" required class="w-full px-4 py-2 border rounded-lg">
        <input type="tel" name="phone" placeholder="Téléphone" required class="w-full px-4 py-2 border rounded-lg">

<%--        <select name="doctorID" required class="w-full px-4 py-2 border rounded-lg">--%>
<%--            <option value="">Sélectionner un médecin</option>--%>
<%--            <% for (Doctor doctor : doctors) { %>--%>
<%--            <option value="<%= doctor.getId() %>"><%= doctor.getName() %> - <%= doctor.getAdresse() %></option>--%>
<%--            <% } %>--%>
<%--        </select>--%>

        <input type="date" name="date" required class="w-full px-4 py-2 border rounded-lg">
        <input type="time" name="time" required class="w-full px-4 py-2 border rounded-lg">

        <textarea name="reason" placeholder="Motif de consultation" required class="w-full px-4 py-2 border rounded-lg"></textarea>

        <button type="submit" class="w-full bg-blue-600 text-white px-4 py-2 rounded-lg shadow-lg hover:bg-blue-700 transition">Réserver</button>
    </form>
</div>
</body>
</html>
