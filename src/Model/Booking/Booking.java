/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Booking;

import Model.Physician;
import java.util.HashMap;


/**
 *
 * @author tomisinoladele
 */
public class Booking {
    
          HashMap<String,AppointmentBooking> bookingappointments = new HashMap<>();   
         //Room room,String name,String treatmentType,String date
         // String suite, String roomType
              
          
          //appointmentbooking
          public void addData(){
              
          // CREATING ROOMS 
          Room room1 = new Room("suite 001","standard");
          Room room2 = new Room("suite 002","enhanced");
          Room room3 = new Room("suite 003","classic");
          
          //CREATING DATES
          Date date1 = new Date(03,06,2021);
          Date date2 = new Date(05,06,2021);
          Date date3 = new Date(07,06,2021);
          Date date4 = new Date(10,06,2021);
          Date date5 = new Date(12,06,2021); 
          
          Physician physician = new Physician(1,"tomi test","ajah","08023120121",2);
          
          AppointmentBooking appointmentBooking = new TreatmentBooking(room1,
                                       "cadio","back pain",date1.getAsString(),
                                        physician);
          
          
          }
}
