/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class BloodBankDirectory {
    private ArrayList<BloodBank> deliveryManList;
   
    private BloodBank deliveryMan;

    public BloodBankDirectory() {
        deliveryManList = new ArrayList<BloodBank>();
    }

    public ArrayList<BloodBank> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<BloodBank> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public BloodBank getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(BloodBank deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
   
    
    
    
    
    
    
    public BloodBank createDeliveryMan(String uName){
        deliveryMan= new BloodBank(uName);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(String username){
         for(int i=0;i<deliveryManList.size();i++){
            if(deliveryManList.get(i).getUserName().equals(username)){
                deliveryManList.remove(i);
            }
        }
    }
}
