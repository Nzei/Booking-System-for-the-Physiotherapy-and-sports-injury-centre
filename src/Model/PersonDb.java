/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author tomisinoladele
 */
public class PersonDb {
     private  ArrayList<Patient> patients;
     private  ArrayList<Physician> physicians;
     
     public PersonDb(){
          patients = new ArrayList<>();
          physicians = new ArrayList<>();
           this.addData();
     }
    public void addData(){
       
        //
        Patient patient = new Patient(1,"ola","Ikeja,Nigeria","08023130221");
        Patient patient2 = new Patient(2,"ade","Ajah,Nigeria","08033130220");
        Patient patient3 = new Patient(3,"simbi","Vgc,Nigeria","07832130221");
        Patient patient4 = new Patient(4,"bukayo","Hatifled,Uk","09023130221");
        Patient patient5 = new Patient(5,"lade","Liverpool,Uk","085231302548");
        
        Physician physician =  new Physician(1,"tomi","Watford",
                                 "08023120121",2);
        //physician.setExpertise(expertisee);
        Physician physician2 =  new Physician(2,"samuel","Lutton",
                                 "08023120121",2);
        Physician physician3 =  new Physician(1,"elizabeth","Hatfield",
                                 "08023120121",2);
        Physician physician4 =  new Physician(1,"chioma","ireland",
                                 "08023120121",2);
        Physician physician5 =  new Physician(1,"sangetha","nepal",
                                 "08023120121",2);
          
        patients.add(patient);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        
        physicians.add(physician);
        physicians.add(physician2);
        physicians.add(physician3);
        physicians.add(physician4);
        physicians.add(physician5);
        
    }
    
    public ArrayList<Patient> getPatients() {
       return patients;
   } 
    public ArrayList<Physician> getPhysicians(){
        return physicians;
    }
    public String toString(){
        String s = "";
       for(Patient p : patients){
         s = s + p.toString()+"\n";
       }
       return s;
     
    }
}
