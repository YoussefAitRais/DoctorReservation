<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DoctorRV - Accueil</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="bg-[url('/image/doctor-bg.jpg')]">
<div class="min-h-screen flex flex-col items-center justify-center">
    <h1 class="text-4xl font-bold text-blue-600 mb-6">Bienvenue sur DoctorRV</h1>
    <p class="text-lg text-gray-700 mb-8">Système de réservation de rendez-vous médicaux</p>

    <div class="flex space-x-6">
        <a href="login.jsp" class="px-6 py-3 bg-blue-600 text-white rounded-lg shadow-lg hover:bg-blue-700 transition">Connexion</a>
        <a href="register.jsp" class="px-6 py-3 bg-green-600 text-white rounded-lg shadow-lg hover:bg-green-700 transition">S'inscrire</a>
    </div>
</div>
</body>
</html>
