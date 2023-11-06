/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author aleja
 */
public abstract class Event {
    public int code;
    public String title;
    public double amount;
    public String description;
    public Calendar day;
    public String eventType;
    public EventCategory category;
    public boolean isCancelled;
    public String eventCategory;

    public Event(int code, String title, double amount, String description, Calendar day, String eventType, EventCategory category) {
        this.code = code;
        this.title = title;
        this.amount = amount;
        this.description = description;
        this.day = day;
        this.eventType = eventType;
        this.category = category;
        this.isCancelled = false;
        
        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDay() {  
        return day;
    }

    public void setDay(Calendar day) {
        this.day = day;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public EventCategory getCategory() {
        return category;
    }

    public void setCategory(EventCategory category) {
        this.category = category;
    }
    
    public boolean isCancelled() {
        
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
    
   
    
    public boolean isPastEvent() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.after(day);
    }
    
    public double getFineAmount(Calendar currentDate) {
    if (category.equals(category.RELIGIOSO)) {
        return 0.0;
    } else {
        long daysDifference = daysBetween(day, currentDate);
        
        if (daysDifference == 1) {
            return amount * 0.5;
        } else if (daysDifference > 1) {
            Calendar nextDate = (Calendar) currentDate.clone();
            nextDate.add(Calendar.DAY_OF_YEAR, -1); // Restar un día
            return getFineAmount(nextDate);
        } else {
            return 0.0; // Caso base
        }
    }
}
    

    
    private long daysBetween(Calendar startDate, Calendar endDate) {
        long differenceInMillis = endDate.getTimeInMillis() - startDate.getTimeInMillis();
        return TimeUnit.DAYS.convert(differenceInMillis, TimeUnit.MILLISECONDS);
    }
    
    
    

    
}
