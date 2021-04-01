/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Booking.AppointmentBooking;
import Model.Booking.Booking;
import Model.Booking.Status;
import Model.Patient;
import Model.Physician;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author tomisinoladele
 */
public class BookingController {
    
     private HashMap<Integer,AppointmentBooking> treatmentappointments; 
     private HashMap<String,ArrayList<Patient>> patientbookings;
     private ArrayList<Patient> patients;
      
               
     Booking bookings = new Booking();
     
     public BookingController(){
        treatmentappointments = bookings.getTreatmentBookingAppointments();
        patients = new ArrayList<>();
     
     }
     
     public String getPhysicianByExpertise(String query){
         
         String s = "";
          for(Integer p : treatmentappointments.keySet())
           {
              if(treatmentappointments.get(p).getPhysician()
                 .getExpertise().equalsIgnoreCase(query))
               {
                 s = s + p + treatmentappointments.get(p);
               }else
               {
                  s = "no available physician with expertise";
               }
            }
         return s;
       }
     
     public String getPhysicianByName(String query){
      String s = "";
      
       for(AppointmentBooking booking : treatmentappointments.values())
       {
         
           if(booking.getPhysician().getFullname().equalsIgnoreCase(query))
           {
               s = s + booking.toString();
           }
                
        }
         s = s + "no available physician with name";
      return s;
     }
    
     public String bookTreatmentAppointment(Integer position)
     {
         String s = "";
         //Iterator<HashMap.Entry<Integer, String>> iterator = treatmentappointments.entrySet().iterator();
         //Iterator<Map.Entry<Integer, AppointmentBooking>> iterator = treatmentappointments.entrySet().iterator();
         for(Integer booking : treatmentappointments.keySet())
        {
            AppointmentBooking b = treatmentappointments.get(booking);
            Patient p = new Patient(1,"test patient","ajah","0903");
            
            if(Objects.equals(booking, position)){
                patients.add(p);
              //AppointmentBooking b = treatmentappointments.get(booking);
              b.setStatus(Status.BOOKED);
//              for(Patient pa : patients)
//               {
//                    if(!patientbookings.containsKey(p.getFullname())){
//                       patientbookings.put(pa.getFullname(), new ArrayList<>());
//                       
//                    }
//                      patientbookings.get(p.getFullname()).add(pa);
//               
//                }
               
              System.out.println(b.toString());
               
                
            }
        }
         return "here";
       
     }
    
}
