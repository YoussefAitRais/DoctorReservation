<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Espace Patient - DoctorRV</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
<div class="container mx-auto p-6">
    <h1 class="text-3xl font-bold text-blue-600 mb-6">Bienvenue, Patient</h1>

    <div class="bg-white shadow-lg rounded-lg p-6">
        <h2 class="text-xl font-semibold mb-4">Mes Rendez-vous</h2>
        <table class="w-full border-collapse">
            <thead>
            <tr class="bg-blue-600 text-white">
                <th class="p-3">Date</th>
                <th class="p-3">Heure</th>
                <th class="p-3">Médecin</th>
                <th class="p-3">Statut</th>
                <th class="p-3">Action</th>
            </tr>
            </thead>
            <tbody>
            <!-- Dynamically insert patient appointments here -->
            </tbody>
        </table>
    </div>

    <a href="Appointment.jsp" class="mt-4 inline-block bg-green-600 text-white px-4 py-2 rounded-lg shadow-lg hover:bg-green-700 transition">Prendre un Rendez-vous</a>
</div>
</body>
</html>
