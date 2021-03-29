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
    
          private HashMap<Integer,AppointmentBooking> bookingappointments;    
         //Room room,String name,String treatmentType,String date
         // String suite, String roomType
          public Booking(){
            bookingappointments = new HashMap<>();
            this.addData();
          }

          
          //appointmentbooking
          public void addData(){
              
          // CREATING ROOMS 
          Room room1 = new Room("suite 001","standard");
          Room room2 = new Room("suite 002","enhanced");
          Room room3 = new Room("suite 003","classic");
          
          //CREATING DATES
          Date date1 = new Date(03,06,2021);
          Date date2 = new Date(05,06,2021);
          Date date3 = new Date(07,06,21);
          Date date4 = new Date(10,06,2021);
          Date date5 = new Date(12,06,2021); 
          
          //CREATING PHYSICIANS
          Physician physician =  new Physician(1,"tomi test","ajah",
                                 "08023120121",2);
          
          physician.setExpertise("Doctor");
          
          Physician physician2 = new Physician(2,"kola","lekki",
                                 "08023120120",2);
          
          physician2.setExpertise("Doctor");
          
          Physician physician3 = new Physician(3,"lola","hatfield"
                                ,"08023120129",2);
          
           physician3.setExpertise("Doctor");
          
          AppointmentBooking appointmentBooking = new TreatmentBooking(room1,
                                       "cadio","back pain",date1.getAsString(),
                                        physician);
          
             
          
          AppointmentBooking appointmentBooking2 = new TreatmentBooking(room2,
                                       "chero","leg",date2.getAsString(),
                                        physician);
          
          AppointmentBooking appointmentBooking3 = new TreatmentBooking(room2,
                                       "optamologist","eye",date3.getAsString(),
                                        physician3);
          
           AppointmentBooking appointmentBooking4 = new TreatmentBooking(room2,
                                       "chero","leg",date2.getAsString(),
                                        physician2);
           
          bookingappointments.put(1, appointmentBooking);
          bookingappointments.put(2, appointmentBooking2);
          bookingappointments.put(3, appointmentBooking3);
          bookingappointments.put(4, appointmentBooking4);
          
          
        }
          
        public HashMap<Integer, AppointmentBooking> getBookingappointments() {
             return bookingappointments;
         }
}
