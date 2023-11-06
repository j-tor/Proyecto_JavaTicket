
package javaticket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserManager {
     public static List<HerenciaUserData> users;
     public static  UserData currentUser;
     

    public UserManager() {
        
        users = new ArrayList<>();
        currentUser = null; 
        registerUser("admin", "admin", "Administrador", "Admin User", 30);
        
        
    }
    

    public boolean registerUser(String username, String password, String userType, String editUserFName, int editAge) {
     for (HerenciaUserData user : users) {
        if (user.getUsername().equals(username)) {
            return false; 
        }
    }

    HerenciaUserData newUser = new HerenciaUserData(username, password, userType, editUserFName, editAge);
    users.add(newUser);
    
    return true; 
}

    public UserData isValidLogin(String username, String password) {
    for (UserData user : users) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return user; 
        }
    }
    return null; 
}
    public List<HerenciaUserData> getUsers() {
        return Collections.unmodifiableList(users);
    }
    
     public List<HerenciaUserData> getUser() {
        return users;
    }
    

    public UserData getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(UserData currentUser) {
        this.currentUser = currentUser;
    }
  
}
