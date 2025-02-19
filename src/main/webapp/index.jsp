<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DoctorRV - Accueil</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="bg-cover bg-center h-screen flex flex-col items-center justify-center bg-opacity-75" style="background-image: url('./image/doctor.jpg')">

<!-- Navbar -->
<nav class="bg-blue-600 p-4 text-white shadow-md fixed top-0 w-full">
    <div class="container mx-auto flex justify-between items-center">
        <a href="index.jsp" class="text-xl font-bold">DoctorRV</a>
        <div class="flex space-x-6 items-center">
            <a href="index.jsp" class="hover:underline">Accueil</a>
            <a href="login.jsp" class="hover:underline">Connexion</a>
            <a href="register.jsp" class="hover:underline">S'inscrire</a>

            <div class="relative group">
                <button class="px-5 py-2.5 text-white bg-blue-700 hover:bg-blue-800 font-medium rounded-lg text-sm text-center inline-flex items-center">
                    Vous êtes
                </button>
                <div class="absolute hidden group-hover:block bg-white divide-y divide-gray-100 rounded-lg shadow-sm w-44">
                    <ul class="py-2 text-sm text-gray-700">
                        <li>
                            <a href="patient-dashboard.jsp" class="block px-4 py-2 hover:bg-gray-100">Patient</a>
                        </li>
                        <li>
                            <a href="doctor-dashboard.jsp" class="block px-4 py-2 hover:bg-gray-100">Médecin</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</nav>

<!-- Contenu principal -->
<div class="flex flex-col items-center justify-center space-y-6 mt-20">
    <h1 class="text-4xl font-bold text-blue-600">Bienvenue sur DoctorRV</h1>
    <p class="text-lg text-black font-bold">Système de réservation de rendez-vous médicaux</p>

    <div class="flex space-x-6">
        <a href="login.jsp" class="px-6 py-3 bg-blue-600 text-white rounded-lg shadow-lg hover:bg-blue-700 transition">Connexion</a>
        <a href="register.jsp" class="px-6 py-3 bg-green-600 text-white rounded-lg shadow-lg hover:bg-green-700 transition">S'inscrire</a>
    </div>
</div>

</body>
</html>
