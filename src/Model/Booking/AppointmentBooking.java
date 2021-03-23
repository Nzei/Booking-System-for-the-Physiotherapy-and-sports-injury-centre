/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;

import Model.Physician;
import java.util.ArrayList;
/**
 *
 * @author tomisinoladele
 */
 enum  attended {yes,no};
public class AppointmentBooking {
    
    private Room room;
    //private final attended attended;
    attended attended;
    private String name;
    private ArrayList <Physician> physician;
    
    public AppointmentBooking(Room room,String name,attended attended){
        this.room = room;
        this.name = name;
        this.attended = attended;
        physician = new ArrayList<>();
        
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Physician> getPhysician() {
        
        return physician;
    }

    public void setPhysician(ArrayList<Physician> physician) {
        this.physician = physician;
    }
    
}
