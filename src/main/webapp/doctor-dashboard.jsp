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
        <h2 class="text-xl font-semibold mb-4">Liste des Rendez-vous</h2>
        <table class="w-full border-collapse">
            <thead>
            <tr class="bg-blue-600 text-white">
                <th class="p-3">Patient</th>
                <th class="p-3">Date</th>
                <th class="p-3">Heure</th>
                <th class="p-3">Motif</th>
                <th class="p-3">Action</th>
            </tr>
            </thead>
            <tbody>
            <!-- Ajouter les rendez-vous dynamiques ici -->
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
