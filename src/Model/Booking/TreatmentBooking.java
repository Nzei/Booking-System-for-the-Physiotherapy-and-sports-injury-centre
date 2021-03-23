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
public class TreatmentBooking extends AppointmentBooking {
    
    private String treatmentType;
    
    public TreatmentBooking(Room room,String name,attended attended,String treatmentType){
        super(room,name,attended);
        this.treatmentType = treatmentType;
    }
    
    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }
    
    public String toString(){
        return (super.getPhysician()+" "+super.getName()+" "+super.attended
                +" "+treatmentType);
    }
    
}
