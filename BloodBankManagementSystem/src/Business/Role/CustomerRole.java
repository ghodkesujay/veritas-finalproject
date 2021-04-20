/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DonorRole.DonorAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sujayghodke
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DonorAreaJPanel(userProcessContainer, account, business);
    }
    
    
}
