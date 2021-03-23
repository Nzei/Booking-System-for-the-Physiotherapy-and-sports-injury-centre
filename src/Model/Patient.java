/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tomisinoladele
 */
public class Patient extends Person {
    
    public Patient(int Id, String fullname, String address, String phone){
        super(Id,fullname,address,phone);
    }
    public String toString(){
         return (super.getFullname() +" "+super.getAddress()+" "+super.getPhone()+ " "+super.getId());
     }
    
   
}
