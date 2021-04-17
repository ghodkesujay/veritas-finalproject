/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

//import Business.Hospital.*;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    private Hospital hospital;
    private HBloodRequirement menu;
    
    
    public HospitalDirectory(){
        this.hospitalList=new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getRestaurantList() {
        return hospitalList;
    }

    public void setRestaurantList(ArrayList<Hospital> restaurantList) {
        this.hospitalList = restaurantList;
    }
    
    public Hospital createRestaurantInfo(String uName){
        hospital= new Hospital(uName);
        hospitalList.add(hospital);
        
        return hospital;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<hospitalList.size();i++){
            if(hospitalList.get(i).getAdminUName().equals(username)){
                hospitalList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(Hospital restro,String name,String number,String address){
        restro.setName(name);
        restro.setAddress(address);
        restro.setNumber(number);
    }
    
    public HBloodRequirement AddMenuDishes(Hospital restro,String name,String desc,String amount){
        menu=new HBloodRequirement(name, desc, amount);
        restro.addDishes(menu);
        return menu;
    }
    
    public void DeleteDishes(Hospital restro,HBloodRequirement menu){
        restro.removeDishes(menu);
        
    }
    
}
