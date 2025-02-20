package com.code.DAO;

import com.code.Model.Doctor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {

    public void addDoctor(Doctor doctor) {
        String sql = "INSERT INTO Doctor (name, adresse, phone) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setString(1, doctor.getName());
            statement.setString(2, doctor.getAdresse());
            statement.setString(3, doctor.getPhone());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        String sql = "SELECT * FROM Doctor";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {  // Renamed rs → result

            while (result.next()) {
                doctors.add(new Doctor(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("adresse"),
                        result.getString("phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctors;
    }

    public void deleteDoctor(int id) {
        String sql = "DELETE FROM Doctor WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
