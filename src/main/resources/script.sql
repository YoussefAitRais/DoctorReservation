CREATE DATABASE DoctorRV;
USE DoctorRV;

CREATE TABLE Doctor (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        adresse VARCHAR(255),
                        phone VARCHAR(20)
);

CREATE TABLE Patient (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         phone VARCHAR(20),
                         adresse VARCHAR(255)
);

CREATE TABLE RendezVous (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            time TIME NOT NULL,
                            date DATE NOT NULL,
                            patientID INT,
                            doctorID INT,
                            FOREIGN KEY (patientID) REFERENCES Patient(id) ON DELETE CASCADE,
                            FOREIGN KEY (doctorID) REFERENCES Doctor(id) ON DELETE CASCADE
);
