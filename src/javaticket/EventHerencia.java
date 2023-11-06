/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */   
public class  EventHerencia extends Event {
    private String Hola;
    private String equipo1;
    private String equipo2;    
    private UserData currentUser;
    private List<Event> equipo1Players;
    private List<Event> equipo2Players;
    private List<Event> equi1; 
    private List<Event> equi2; 
    private List<String> addPlayerToEquipo1;
    private List<String> addPlayerToEquipo2;

   public EventHerencia(int code, String title, double amount, String description, Calendar day, String eventType, EventCategory eventCategory, UserData currentUser) {
        super(code, title, amount, description, day, eventType, eventCategory);
        this.currentUser = currentUser;
    
            
        equipo1Players = new ArrayList<>();
        equipo2Players = new ArrayList<>();
        equi1 = new ArrayList<>();
        equi2 = new ArrayList<>();
    }

    public UserData getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(UserData currentUser) {
        this.currentUser = currentUser;
    }

   

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public List<Event> getEquipo1Players() {
        return equipo1Players;
    }

    public List<Event> getEquipo2Players() {
        return equipo2Players;
    }
    

    
    public void addPlayerToEquipo1(List<String> player) {
        this.addPlayerToEquipo1=player;

    }

    public void addPlayerToEquipo2(List<String> player) {
         this.addPlayerToEquipo2=player;
    }

    public List<String> getAddPlayerToEquipo1() {
        return addPlayerToEquipo1;
    }

    public void setAddPlayerToEquipo1(List<String> addPlayerToEquipo1) {
        this.addPlayerToEquipo1 = addPlayerToEquipo1;
    }

    public List<String> getAddPlayerToEquipo2() {
        return addPlayerToEquipo2;
    }

    public void setAddPlayerToEquipo2(List<String> addPlayerToEquipo2) {
        this.addPlayerToEquipo2 = addPlayerToEquipo2;
    }
    
    

    public String getHola() {
        return Hola;
    }

    public void setHola(String Hola) {
        this.Hola = Hola;
    }
    
     
    
    
     public void AgregarPlayer() {
//        String Sjugadores1 = JOptionPane.showInputDialog("Ingrese la cantidad de jugadores del Equipo 1");
//        String Sjugadores2 = JOptionPane.showInputDialog("Ingrese la cantidad de jugadores del Equipo 2");
//        int jugadores1 = Integer.parseInt(Sjugadores1);
//        int jugadores2 = Integer.parseInt(Sjugadores2);
//        boolean mostrar1 = true;
//        boolean mostrar2 = true;
//
//        // Para agregar el primero
//        for (int i = 0; i < jugadores1; i++) {
//            if (mostrar1) {
//                JOptionPane.showMessageDialog(null, "Ingrese el nombre de los jugadores del primer equipo");
//                mostrar1 = false;
//            }
//            String jugador = JOptionPane.showInputDialog("Ingrese el nombre de jugardor numero: " + i);
//            equi1.add(new Equipo1(jugador));
//        }
//
//        // Para agregar el segundo equipo
//        for (int i = 0; i < jugadores2; i++) {
//            if (mostrar2) {
//                JOptionPane.showMessageDialog(null, "Ingrese el nombre de los jugadores del segundo equipo");
//                mostrar2 = false;
//            }
//            String jugador2 = JOptionPane.showInputDialog("Ingrese el nombre de jugardor numero: " + i);
//            equi2.add(new Equipo2(jugador2));
//        }
//
//        System.out.println("Se han agregado todos los jugadores");
//        System.out.println("Primer equipo: ");
//        for (Equipo1 a : equi1) {
//            System.out.println(a.toString() + " jugador1");
//        }
//        System.out.println("Segundo equipo: ");
//        for (Equipo2 e : equi2) {
//            System.out.println(e.toString() + " jugador2");
//        }
    }
}


