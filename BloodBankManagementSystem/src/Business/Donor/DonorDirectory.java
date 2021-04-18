/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class DonorDirectory {
    private ArrayList<Donor> custList;
   
    private Donor customer;
    public ArrayList<Donor> getCustList() {
        return custList;
    }
    
    
    
    public void setCustList(ArrayList<Donor> custList) {
        this.custList = custList;
    }
    
    
    
    public DonorDirectory(){
        this.custList=new ArrayList<Donor>();
    }
    
    
    
    public Donor createCustomer(String uName){
        customer= new Donor(uName);
        custList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<custList.size();i++){
            if(custList.get(i).getUserName().equals(username)){
                custList.remove(i);
            }
        }
    }
}
