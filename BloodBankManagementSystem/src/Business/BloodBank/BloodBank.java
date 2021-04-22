/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.DonationRequest.DonationRequest;
import Business.CollectionPoint.BloodRequirement;
import Business.Hospital.HBloodRequirement;
import Business.ReceiveRequest.ReceiveRequest;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class BloodBank {
    private String Name;
    private String UserName;
    private ArrayList<DonationRequest> orderList;
    private ArrayList<ReceiveRequest> requestlist;
    private String address;
    private String number;

    public BloodBank() {
        requestlist = new ArrayList<ReceiveRequest>();
    }
     
    
    
    public void addOrder(String collectionPointName, String customerName, String deliverMan, ArrayList<BloodRequirement> Order, String cost, String deliveryAddress) {

        DonationRequest order = new DonationRequest();
        order.setDonorName(customerName);
        order.setCollectionPointName(collectionPointName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
    }
        
    public void addRequest(String hospitalName, String customerName, String deliverMan, ArrayList<HBloodRequirement> Order, String deliveryAddress) {

        ReceiveRequest order1 = new ReceiveRequest();
        order1.setPatientName(customerName);
        order1.setHospitalName(hospitalName);
        order1.setDeliverMan(deliverMan);
        order1.setOrder(Order); 
        order1.setAddress(deliveryAddress);
        order1.setStatus("New Request");
        requestlist.add(order1);

    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    

    public BloodBank(String UserName){
        this.UserName=UserName;
        requestlist = new ArrayList<ReceiveRequest>();
        orderList=new ArrayList<DonationRequest>();
        
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<DonationRequest> getOrderList() {
        return orderList;
    }

    public ArrayList<ReceiveRequest> getRequestlist() {
        return requestlist;
    }

    public void setRequestlist(ArrayList<ReceiveRequest> requestlist) {
        this.requestlist = requestlist;
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
    @Override
    public String toString() {
        return UserName;
    }
    
}
