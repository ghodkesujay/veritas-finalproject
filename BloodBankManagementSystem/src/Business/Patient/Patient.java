/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.CollectionPoint.BloodRequirement;
import Business.DonationRequest.DonationRequest;
import java.util.ArrayList;

public class Patient {
    /*n    */
    int id=101;
    private String Patientname;
     private String UserName;
      private ArrayList<DonationRequest> orderList;
     public void addOrder(String collectionPointName, String customerName, String deliverMan, ArrayList<BloodRequirement> Order, String cost, String deliveryAddress) {
        DonationRequest order=new DonationRequest();
        order.setOrder_id(String.valueOf(id));
        order.setDonorName(customerName);
        order.setCollectionPointName(collectionPointName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    private String address;
    private String number;

    public Patient(String UserName){
        this.UserName=UserName;
        orderList=new ArrayList<DonationRequest>();
    }
    
    public String getName() {
        return Patientname;
    }

    public void setName(String Name) {
        this.Patientname = Name;
    }

    public ArrayList<DonationRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<DonationRequest> order) {
        this.orderList = order;
    }

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

}
