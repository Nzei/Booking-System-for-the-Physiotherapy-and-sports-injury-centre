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
public class Expertise  {
    
    private String expertise ;
    
    public Expertise(String expertise){
        this.expertise = expertise;
    }
   
    
    
//    public void setExpertise(Physician physician){
//       expertise.add(physician);
//    }
//    public String getExpertise(String expertisee){
//        
//        for(int i = 0; i < expertise.size(); i++){
//           Physician physician = expertise.get(i);
//            if(physician.getExpertise().equalsIgnoreCase(expertisee)){
//               return physician.toString();
//            }
//        }
//         
//        return null;
//    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
    
}
