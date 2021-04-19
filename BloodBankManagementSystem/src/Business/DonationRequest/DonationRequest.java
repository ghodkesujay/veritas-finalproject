/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DonationRequest;

import Business.CollectionPoint.BloodRequirement;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class DonationRequest {
    
    private String order_id;
    private String deliveryAddress;
    private String collectionPointName;
    private String donorName;
    private String deliverMan;
    private ArrayList<BloodRequirement> Order;
    private String cost;
    private String status;
    

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getCollectionPointName() {
        return collectionPointName;
    }

    public void setCollectionPointName(String collectionPointName) {
        this.collectionPointName = collectionPointName;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(String deliverMan) {
        this.deliverMan = deliverMan;
    }

    public ArrayList<BloodRequirement> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<BloodRequirement> Order) {
        this.Order = Order;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    @Override
    public String toString() {
        return order_id;
    }
    
}
