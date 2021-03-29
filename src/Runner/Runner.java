/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import Controller.BookingController;
import Controller.PersonController;
import Model.Booking.Booking;
import Model.Patient;
import Model.PersonDb;
import Model.Physician;

/**
 *
 * @author tomisinoladele
 */
public class Runner {
    
    public static void main (String [] args){
        
        Booking bookings = new Booking();
        PersonDb pb = new PersonDb();
        bookings.addData();
        pb.addData();
        
       
         PersonController pc = new PersonController();
         BookingController bc = new BookingController();
        System.out.println(bc.bookAppointment(3));
        //System.out.println(bc.getPhysicianByName("tomi test"));
    }
}
