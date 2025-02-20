package com.code.Model;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
    private int id;
    private Time time;
    private Date date;
    private int patientID;
    private int doctorID;

    // Constructor with all fields
    public Appointment(int id, Time time, Date date, int patientID, int doctorID) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.patientID = patientID;
        this.doctorID = doctorID;
    }

    // Constructor without ID (for creating new appointments)
    public Appointment(Time time, Date date, int patientID, int doctorID) {
        this.time = time;
        this.date = date;
        this.patientID = patientID;
        this.doctorID = doctorID;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    public int getDoctorID() { return doctorID; }
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", time=" + time +
                ", date=" + date +
                ", patientID=" + patientID +
                ", doctorID=" + doctorID +
                '}';
    }
}
