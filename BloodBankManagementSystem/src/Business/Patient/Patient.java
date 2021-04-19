/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

//import Business.CollectionPoint.BloodRequirement;
import Business.Hospital.HBloodRequirement;
import Business.ReceiveRequest.ReceiveRequest;
import java.util.ArrayList;

public class Patient {
    /*n    */
    int id=101;
    private String Patientname;
     private String UserName;
      private ArrayList<ReceiveRequest> orderList;
     public void addOrder( String customerName, ArrayList<HBloodRequirement> Order,String requestPointName, String Address) {
        ReceiveRequest order=new ReceiveRequest();
        order.setOrder_id(String.valueOf(id));
        order.setPatientName(Patientname);
        order.setRequestpPointName(requestPointName);
        order.setOrder(Order);
        order.setAddress(Address);
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
        orderList=new ArrayList<ReceiveRequest>();
    }
    
    public String getName() {
        return Patientname;
    }

    public void setName(String Name) {
        this.Patientname = Name;
    }

    public ArrayList<ReceiveRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<ReceiveRequest> order) {
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
