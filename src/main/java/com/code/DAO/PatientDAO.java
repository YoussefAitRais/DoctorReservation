package com.code.DAO;

import com.code.Model.Patient;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    public void addPatient(Patient patient) {
        String sql = "INSERT INTO Patient (name, phone, adresse) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setString(1, patient.getName());
            statement.setString(2, patient.getPhone());
            statement.setString(3, patient.getAdresse());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM Patient";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {  // Renamed rs → result

            while (result.next()) {
                patients.add(new Patient(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("phone"),
                        result.getString("adresse")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    public Patient getPatientById(int id) {
        Patient patient = null;
        String sql = "SELECT * FROM Patient WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setInt(1, id);
            try (ResultSet result = statement.executeQuery()) {  // Renamed rs → result
                if (result.next()) {
                    patient = new Patient(
                            result.getInt("id"),
                            result.getString("name"),
                            result.getString("phone"),
                            result.getString("adresse")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;
    }

    public void updatePatient(int id, Patient patient) {
        String sql = "UPDATE Patient SET name = ?, phone = ?, adresse = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setString(1, patient.getName());
            statement.setString(2, patient.getPhone());
            statement.setString(3, patient.getAdresse());
            statement.setInt(4, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePatient(int id) {
        String sql = "DELETE FROM Patient WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
