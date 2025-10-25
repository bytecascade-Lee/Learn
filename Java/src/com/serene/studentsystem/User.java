package com.serene.studentsystem;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/23
 */
public class User {
    private String userName;
    private String password;
    private String ID;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String password, String ID, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
