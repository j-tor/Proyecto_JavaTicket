/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class HerenciaUserData extends UserData {
    private String editUserFName;
    private int editAge;
   
    private List<Event> events;
    

    public HerenciaUserData(String username, String password, String userType, String editUserFName, int editAge) {
        super(username, password, userType);
        this.editUserFName = editUserFName;
        this.editAge = editAge;
        this.editUserFName = editUserFName;
        events = new ArrayList<>();

    }

    public String getEditUserFName() {
        return editUserFName;
    }

    public void setEditUserFName(String editUserFName) {
        this.editUserFName = editUserFName;
    }

    public int getEditAge() {
        return editAge;
    }

    public void setEditAge(int editAge) {
        this.editAge = editAge;
    }
    
       public void setUsername(String username) {
        this.username = username;
    }
       public void setPassword(String password) {
        this.password = password;
    }
       public void setUserType(String userType) {
        this.userType = userType;
    }  
    public List<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        events.add(event);
    }
}