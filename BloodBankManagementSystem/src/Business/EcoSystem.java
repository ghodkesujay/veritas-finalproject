/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Donor.DonorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.CollectionPoint.CollectionPointDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private CollectionPointDirectory restaurantDirectory;
    private DonorDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;

    //Customer Directory methods to get and set values
    public DonorDirectory getCustomerDirectory() {
        if(customerDirectory == null)
        {
            customerDirectory = new DonorDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(DonorDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    //Restaurant Directory methods to get and set values
    public CollectionPointDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null)
        {
            restaurantDirectory = new CollectionPointDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(CollectionPointDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    //Delivery Man methods to get and set values
    public DeliveryManDirectory getDeliveryManDirectory() {
        if(deliveryManDirectory == null)
        {
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    
    public EcoSystem(CollectionPointDirectory restaurantDirectory, DonorDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
