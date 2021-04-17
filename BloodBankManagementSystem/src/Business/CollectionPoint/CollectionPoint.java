/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CollectionPoint;

import Business.DonationRequest.DonationRequest;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class CollectionPoint {
    
    private String adminUName;
    private ArrayList<BloodRequirement> Menu;
    private ArrayList<DonationRequest> donationRequestList;
    int id=101;

    public ArrayList<DonationRequest> getOrderList() {
        return donationRequestList;
    }

    public void setOrderList(ArrayList<DonationRequest> donationRequestList) {
        this.donationRequestList = donationRequestList;
    }

  
    
     public void addOrder(String collectionPointName, String customerName, String deliverMan, ArrayList<BloodRequirement> Order, String cost, String deliveryAddress) {
        DonationRequest order=new DonationRequest();
        order.setOrder_id(String.valueOf(id));
        order.setDonorName(customerName);
        order.setCollectionPointName(collectionPointName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Request");
        donationRequestList.add(order);
        id++;
    }
     
    public ArrayList<BloodRequirement> getMenu() {
        return Menu;
    }
    
    
    public void addDishes(BloodRequirement menu){
        
        Menu.add(menu);
    }
    
    
    
    public void removeDishes(BloodRequirement menu){
        
        Menu.remove(menu);
    }

    
    
    public String getAdminUName() {
        return adminUName;
    }

    

    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public CollectionPoint(String UName) {
        this.adminUName=UName;
        Menu=new ArrayList<BloodRequirement>();
        donationRequestList=new ArrayList<DonationRequest>();
    }
    
  
    private String name;
    private String address;
    private String number;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
