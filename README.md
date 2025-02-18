# DoctorReservation
![UseCaseDoctor](https://github.com/user-attachments/assets/b4a9918d-d6b0-4688-a2c5-e01acd7617b5)





![SequenceDiagramDoctor](https://github.com/user-attachments/assets/35b522cd-73b1-4322-b462-726bab4433c6)





![ClassDiagramDoctor](https://github.com/user-attachments/assets/d4879539-c8c9-4507-bef6-19d062b1b681)





-- Create the database
CREATE DATABASE DoctorRV;
USE DoctorRV;

-- Table for Doctors
CREATE TABLE Doctor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    adresse VARCHAR(255),
    phone VARCHAR(20)
);

-- Table for Patients
CREATE TABLE Patient (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20),
    adresse VARCHAR(255)
);

-- Table for Appointments (Rendez-vous)
CREATE TABLE RendezVous (
    id INT AUTO_INCREMENT PRIMARY KEY,
    time TIME NOT NULL,
    date DATE NOT NULL,
    patientID INT,
    doctorID INT,
    FOREIGN KEY (patientID) REFERENCES Patient(id) ON DELETE CASCADE,
    FOREIGN KEY (doctorID) REFERENCES Doctor(id) ON DELETE CASCADE
);
