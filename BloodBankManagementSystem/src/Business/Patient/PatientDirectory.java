/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author manans
 */

import Business.Patient.Patient;
import java.util.ArrayList;

public class PatientDirectory {
    private ArrayList<Patient> custList;
   
    private Patient customer;
    public ArrayList<Patient> getCustList() {
        return custList;
    }
    
    
    
    public void setCustList(ArrayList<Patient> custList) {
        this.custList = custList;
    }
    
    
    
    public PatientDirectory(){
        this.custList=new ArrayList<Patient>();
    }
    
    
    
    public Patient createCustomer(String uName){
        customer= new Patient(uName);
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
