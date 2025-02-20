<%@ page import="java.util.List" %>
<%@ page import="com.code.Model.Doctor" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Espace Médecin</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
<div class="container mx-auto p-6">
    <h1 class="text-3xl font-bold text-blue-600 mb-6">Bienvenue, Docteur</h1>

    <div class="bg-white shadow-lg rounded-lg p-6">
        <h2 class="text-xl font-semibold mb-4">Liste des Médecins</h2>

        <table class="w-full border-collapse">
            <thead>
            <tr class="bg-blue-600 text-white">
                <th class="p-3">ID</th>
                <th class="p-3">Nom</th>
                <th class="p-3">Adresse</th>
                <th class="p-3">Téléphone</th>
                <th class="p-3">Action</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Doctor> doctors = (List<Doctor>) request.getAttribute("doctors");
                if (doctors != null) {
                    for (Doctor doctor : doctors) {
            %>
            <tr class="border-b">
                <td class="p-3"><%= doctor.getId() %></td>
                <td class="p-3"><%= doctor.getName() %></td>
                <td class="p-3"><%= doctor.getAdresse() %></td>
                <td class="p-3"><%= doctor.getPhone() %></td>
                <td class="p-3">
                    <form action="doctor" method="post">
                        <input type="hidden" name="id" value="<%= doctor.getId() %>">
                        <button type="submit" class="bg-red-500 text-white px-4 py-1 rounded">Supprimer</button>
                    </form>
                </td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="5" class="text-center p-3">Aucun médecin trouvé</td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
