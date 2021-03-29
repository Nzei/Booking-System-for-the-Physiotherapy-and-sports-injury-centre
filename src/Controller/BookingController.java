/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Booking.AppointmentBooking;
import Model.Booking.Booking;
import Model.Booking.Status;
import Model.Physician;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author tomisinoladele
 */
public class BookingController {
    
     private HashMap<Integer,AppointmentBooking> bookingappointments; 
     Booking bookings = new Booking();
     
     public BookingController(){
         bookingappointments = bookings.getBookingappointments();
     
     }
     
     public String getPhysicianByExpertise(String query){
         
         String s = "";
          for(Integer p : bookingappointments.keySet())
           {
              if(bookingappointments.get(p).getPhysician()
                 .getExpertise().equalsIgnoreCase(query))
               {
                 s = s + p + bookingappointments.get(p);
               }
                s = "no available physician with expertise";
            }
         return s;
     }
     
     public String getPhysicianByName(String query){
      String s = "";
      
       for(AppointmentBooking booking : bookingappointments.values())
       {
         
           if(booking.getPhysician().getFullname().equalsIgnoreCase(query))
           {
               s = s + booking.toString();
           }
                
        }
         s = s + "no available physician with name";
      return s;
     }
    
     public String bookAppointment(Integer position)
     {
         String s = "";
         for(Integer booking : bookingappointments.keySet())
        {
            if(Objects.equals(booking, position)){
                
              AppointmentBooking b = bookingappointments.get(booking);
              b.setStatus(Status.BOOKED);
                
                System.out.println(bookingappointments.get(booking).toString());
               
                
            }
        }
         return "here";
       
     }
    
}
