/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

//import Business.Hospital.*;

/**
 *
 * @author Harsh
 */
public class HBloodRequirement {
    private String name;
    private String amount;
    private String description;

    public HBloodRequirement(String name,String description,String amount) {
        this.name=name;
        this.amount=amount;
        this.description=description;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return amount;
    }

    public void setPrice(String price) {
        this.amount = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return name;
    }
}
