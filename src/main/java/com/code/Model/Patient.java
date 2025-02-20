package com.code.Model;

public class Patient {
    private int id;
    private String name;
    private String phone;
    private String adresse;

    // Constructor with all fields
    public Patient(int id, String name, String phone, String adresse) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adresse = adresse;
    }

    // Constructor without ID (for creating new patients)
    public Patient(String name, String phone, String adresse) {
        this.name = name;
        this.phone = phone;
        this.adresse = adresse;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
