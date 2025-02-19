<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscription - DoctorRV</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100  items-center justify-center min-h-screen">
<!-- Navbar -->
<nav class="bg-blue-600 p-4 text-white shadow-md">
    <div class="container mx-auto flex justify-between items-center">
        <a href="index.jsp" class="text-xl font-bold">DoctorRV</a>
        <div class="space-x-6">
            <a href="index.jsp" class="hover:underline">Accueil</a>
            <a href="login.jsp" class="hover:underline">Connexion</a>
            <a href="register.jsp" class="hover:underline">S'inscrire</a>
        </div>
    </div>
</nav>
<div class="bg-white p-8 rounded-lg shadow-lg w-full max-w-md">
    <h2 class="text-2xl font-bold text-center text-blue-600 mb-6">Créer un compte</h2>

    <form action="RegisterServlet" method="post" class="space-y-4">
        <input type="text" name="name" placeholder="Nom complet" required class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600">
        <input type="email" name="email" placeholder="Email" required class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600">
        <input type="text" name="phone" placeholder="Téléphone" required class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600">
        <input type="password" name="password" placeholder="Mot de passe" required class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600">

        <select name="role" required class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600">
            <option value="patient">Patient</option>
            <option value="medecin">Médecin</option>
        </select>

        <button type="submit" class="w-full bg-blue-600 text-white px-4 py-2 rounded-lg shadow-lg hover:bg-blue-700 transition">S'inscrire</button>
    </form>

    <p class="text-center text-gray-600 mt-4">Déjà un compte ? <a href="login.jsp" class="text-blue-600 hover:underline">Se connecter</a></p>
</div>
</body>
</html>
