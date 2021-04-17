/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.CollectionPoint.*;
import Business.ReceiveRequest.ReceiveRequest;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class Hospital {
    
    private String adminUName;
    private ArrayList<HBloodRequirement> Menu;
    private ArrayList<ReceiveRequest> receiveRequestList;
    int id=101;

    public ArrayList<ReceiveRequest> getOrderList() {
        return receiveRequestList;
    }

    public void setOrderList(ArrayList<ReceiveRequest> receiveRequestList) {
        this.receiveRequestList = receiveRequestList;
    }

  
    
     public void addOrder(String hospitalName, String customerName, String deliverMan, ArrayList<HBloodRequirement> Order, String cost, String deliveryAddress) {
        ReceiveRequest order=new ReceiveRequest();
        order.setOrder_id(String.valueOf(id));
        order.setDonorName(customerName);
        order.setCollectionPointName(hospitalName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Request");
        receiveRequestList.add(order);
        id++;
    }
     
    public ArrayList<HBloodRequirement> getMenu() {
        return Menu;
    }
    
    
    public void addDishes(HBloodRequirement menu){
        
        Menu.add(menu);
    }
    
    
    
    public void removeDishes(HBloodRequirement menu){
        
        Menu.remove(menu);
    }

    
    
    public String getAdminUName() {
        return adminUName;
    }

    

    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public Hospital(String UName) {
        this.adminUName=UName;
        Menu=new ArrayList<HBloodRequirement>();
        receiveRequestList=new ArrayList<ReceiveRequest>();
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
