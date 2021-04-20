/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CollectionPointRole.CollectionPointWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sujayghodke
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CollectionPointWorkAreaJPanel(userProcessContainer, account, business);
    }

    
    
}
