/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Guilherme da Rosa Ferreira  
 */
public class MainController implements Initializable {

    @FXML
    private Label textLabel;
    @FXML
    private TextField textUser;
    @FXML
    private PasswordField passField;
    
    /**Event Handler of the first button
     * 
     * @param event 
     */
    public void handlerButton(ActionEvent event){
        if(textUser.getText().equals("admin") && passField.getText().equals("admin")){
            textLabel.setText("Welcome");
        }else{
            textLabel.setText("User or Password Invalid");
        }
    }
    /** Event Handler onEnter
     * 
     * @param ae 
     */
    @FXML
    public void onEnter(ActionEvent ae){
        handlerButton(ae);
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
