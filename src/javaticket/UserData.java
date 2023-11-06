/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class UserData {
    String username;
    String password;
    String userType;

    public UserData(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public final String getUserType() {
        return userType;
    }
    
    

   
}

