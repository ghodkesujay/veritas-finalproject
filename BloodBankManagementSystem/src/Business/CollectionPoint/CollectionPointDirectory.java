/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CollectionPoint;

import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class CollectionPointDirectory {
    
    private ArrayList<CollectionPoint> collectionPointList;
    private CollectionPoint collectionPoint;
    private BloodRequirement menu;
    
    
    public CollectionPointDirectory(){
        this.collectionPointList=new ArrayList<CollectionPoint>();
    }

    public ArrayList<CollectionPoint> getRestaurantList() {
        return collectionPointList;
    }

    public void setRestaurantList(ArrayList<CollectionPoint> restaurantList) {
        this.collectionPointList = restaurantList;
    }
    
    public CollectionPoint createRestaurantInfo(String uName){
        collectionPoint= new CollectionPoint(uName);
        collectionPointList.add(collectionPoint);
        
        return collectionPoint;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<collectionPointList.size();i++){
            if(collectionPointList.get(i).getAdminUName().equals(username)){
                collectionPointList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(CollectionPoint restro,String name,String number,String address){
        restro.setName(name);
        restro.setAddress(address);
        restro.setNumber(number);
    }
    
    public BloodRequirement AddMenuDishes(CollectionPoint restro,String name,String desc,String amount){
        menu=new BloodRequirement(name, desc, amount);
        restro.addDishes(menu);
        return menu;
    }
    
    public void DeleteDishes(CollectionPoint restro,BloodRequirement menu){
        restro.removeDishes(menu);
        
    }
    
}
