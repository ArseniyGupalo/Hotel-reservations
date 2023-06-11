package com.example.govoo;

public class User {
    private String firstName;
    private String phone;
    private String userName;
    private String password;
    private String location;
    private String gender;
    private String iduser;


    public User(String firstName, String phone, String userName, String password, String location, String gender) {
        this.firstName = firstName;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.location = location;
        this.gender = gender;
    }

    public User() {}


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }
}
