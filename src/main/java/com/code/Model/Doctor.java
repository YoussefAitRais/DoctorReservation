package com.code.Model;

public class Doctor {
    private int id;
    private String name;
    private String adresse;
    private String phone;

    // Constructor with all fields
    public Doctor(int id, String name, String adresse, String phone) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.phone = phone;
    }

    // Constructor without ID (for creating new doctors)
    public Doctor(String name, String adresse, String phone) {
        this.name = name;
        this.adresse = adresse;
        this.phone = phone;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
