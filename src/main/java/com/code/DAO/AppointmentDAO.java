package com.code.DAO;

import com.code.Model.Appointment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {

    public void addAppointment(Appointment appointment) {
        String sql = "INSERT INTO RendezVous (time, date, patientID, doctorID) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setTime(1, appointment.getTime());
            statement.setDate(2, appointment.getDate());
            statement.setInt(3, appointment.getPatientID());
            statement.setInt(4, appointment.getDoctorID());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Appointment> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        String sql = "SELECT * FROM RendezVous";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {  // Renamed rs → result

            while (result.next()) {
                appointments.add(new Appointment(
                        result.getInt("id"),
                        result.getTime("time"),
                        result.getDate("date"),
                        result.getInt("patientID"),
                        result.getInt("doctorID")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }

    public Appointment getAppointmentById(int id) {
        Appointment appointment = null;
        String sql = "SELECT * FROM RendezVous WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setInt(1, id);
            try (ResultSet result = statement.executeQuery()) {  // Renamed rs → result
                if (result.next()) {
                    appointment = new Appointment(
                            result.getInt("id"),
                            result.getTime("time"),
                            result.getDate("date"),
                            result.getInt("patientID"),
                            result.getInt("doctorID")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointment;
    }

    public void updateAppointment(int id, Appointment appointment) {
        String sql = "UPDATE RendezVous SET time = ?, date = ?, patientID = ?, doctorID = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setTime(1, appointment.getTime());
            statement.setDate(2, appointment.getDate());
            statement.setInt(3, appointment.getPatientID());
            statement.setInt(4, appointment.getDoctorID());
            statement.setInt(5, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAppointment(int id) {
        String sql = "DELETE FROM RendezVous WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {  // Renamed stmt → statement

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
