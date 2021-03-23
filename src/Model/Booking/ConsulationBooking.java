/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;

/**
 *
 * @author tomisinoladele
 */
public class ConsulationBooking extends AppointmentBooking{
    
    private String visitorName;
    private String note;

    public ConsulationBooking(Room room,String name,attended attended,String vistorName,String note){
        super(room,name,attended);
        this.visitorName = visitorName;
        this.note = note;
    }
    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
