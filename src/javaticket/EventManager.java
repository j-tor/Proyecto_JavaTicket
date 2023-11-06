/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

/**
 *
 * @author aleja
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    public List<Event> eventos;  
    

    public EventManager() {
        eventos = new ArrayList<>(); 
    }

    public void agregarEvento(Event evento) {
        eventos.add(evento); 
    }

    public List<Event> getEventos() {
        return eventos; 
    }

    public void eliminarEvento(Event evento) {
        eventos.remove(evento); 
    }

    public Event buscarEventoPorCodigo(int codigo) {
        for (Event evento : eventos) {
            if (evento.getCode() == codigo) {
                return evento; 
            }
        }
        return null; 
    }
    
    public void imprimirEventos() {
        for (Event evento : eventos) {
        System.out.println("Datos de eventos:");
        System.out.println("Código: " + evento.getCode());
        System.out.println("Categoría: " + evento.getCategory());
        System.out.println("Título: " + evento.getTitle());
        System.out.println("Monto: " + evento.getAmount());
        System.out.println("Descripción: " + evento.getDescription());
        System.out.println("Tipo de Evento: " + evento.getEventType());

        // Formatear la fecha al estilo "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(evento.getDay().getTime());
        System.out.println("Día: " + formattedDate);

        // Imprimir equipos
        if (evento instanceof EventHerencia) {
            EventHerencia eventHerencia = (EventHerencia) evento;
            System.out.println("Equipo 1: " + eventHerencia.getEquipo1());
            System.out.println("Equipo 2: " + eventHerencia.getEquipo2());
        }

        System.out.println();
        }
        
        
//        if (index >= eventos.size()) {
//        return; // Caso base: hemos impreso todos los eventos
//    }
//
//    Event evento = eventos.get(index);
//    System.out.println("Datos de eventos:");
//    System.out.println("Código: " + evento.getCode());
//    System.out.println("Categoría: " + evento.getCategory());
//    System.out.println("Título: " + evento.getTitle());
//    System.out.println("Monto: " + evento.getAmount());
//    System.out.println("Descripción: " + evento.getDescription());
//    System.out.println("Tipo de Evento: " + evento.getEventType());
//
//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    String formattedDate = dateFormat.format(evento.getDay().getTime());
//    System.out.println("Día: " + formattedDate);
//
//    if (evento instanceof EventHerencia) {
//        EventHerencia eventHerencia = (EventHerencia) evento;
//        System.out.println("Equipo 1: " + eventHerencia.getEquipo1());
//        System.out.println("Equipo 2: " + eventHerencia.getEquipo2());
//    }
//
//    System.out.println();
//
//    imprimirEventos(eventos, index + 1);

}
    
    
}
