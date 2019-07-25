package com.example.itentendemo3;

import java.util.Date;

public class Model {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String tc;
    private String birthPlace;
    private String birthDate;
    private String adress;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private int image;

    public Model(String name, String surname, String email, String phone, String tc, String birthPlace,int image, String birthDate, String adress) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.tc = tc;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.adress = adress;
        this.image = image;
    }

    public Model() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
