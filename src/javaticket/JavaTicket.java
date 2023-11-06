/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaticket;



/**
 *
 * @author aleja
 */
public class JavaTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //main1
           UserManager userManager = new UserManager();
           UserData currentuser = new UserData("username", "password", "Administrador"); // Replace with actual user data
           
           EventManager eventManager = new EventManager();
            Menu menu = new Menu(userManager, currentuser);
            Login login = new Login(userManager,menu,eventManager);
            login.setVisible(true);

       
    }
    }
    

