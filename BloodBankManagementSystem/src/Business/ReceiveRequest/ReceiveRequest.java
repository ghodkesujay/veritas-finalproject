/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ReceiveRequest;

import Business.CollectionPoint.BloodRequirement;
import Business.Hospital.HBloodRequirement;
import java.util.ArrayList;

/**
 *
 * @author manans
 */
public class ReceiveRequest {
    
    private String order_id;
    private String Address;
    private String hospitalName;
    private String patientName;
    private ArrayList<HBloodRequirement> Order;
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


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public ArrayList<HBloodRequirement> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<HBloodRequirement> Order) {
        this.Order = Order;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String deliveryAddress) {
        this.Address = Address;
    }
    @Override
    public String toString() {
        return order_id;
    }
    
}
