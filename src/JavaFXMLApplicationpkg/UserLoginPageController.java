/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXMLApplicationpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class UserLoginPageController implements Initializable {
    
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField textPassword;
    @FXML
    private Button Button;
    @FXML
    private ComboBox<String> UserComboBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UserComboBox.getItems().addAll("Supplier","Buyer","Supervisor","Accounts and Finance","Admin");
    }    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
      if(event.getSource()==Button){
            String Username = textUsername.getText();
            String Password = textPassword.getText();
            if(UserComboBox.getSelectionModel().getSelectedItem().equals("Supplier") && Username.equalsIgnoreCase("Supplier") && Password.equalsIgnoreCase("00000")){
                 System.out.println("Successfully Login");
                 Parent userScene = FXMLLoader.load(getClass().getResource("SuppliareHomePage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
            else{
                System.out.println("Somthing Wrong Try Again");
            }
             if(UserComboBox.getSelectionModel().getSelectedItem().equals("Buyer") && Username.equalsIgnoreCase("Buyer") && Password.equalsIgnoreCase("11111")){
                 System.out.println("Successfully Login");
                 Parent userScene = FXMLLoader.load(getClass().getResource("BuyerHomePage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
            else{
                System.out.println("Somthing Wrong Try Again");
            }
            if(UserComboBox.getSelectionModel().getSelectedItem().equals("Supervisor") && Username.equalsIgnoreCase("Supervisor") && Password.equalsIgnoreCase("22222")){
                 System.out.println("Successfully Login");
                 Parent userScene = FXMLLoader.load(getClass().getResource("SupervisorHomePage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
            else{
                System.out.println("Somthing Wrong Try Again");
            }
            if(UserComboBox.getSelectionModel().getSelectedItem().equals("Accounts and Finance") && Username.equalsIgnoreCase("Accounts and Finance") && Password.equalsIgnoreCase("33333")){
                 System.out.println("Successfully Login");
                 Parent userScene = FXMLLoader.load(getClass().getResource("AccountsandFinanceHomePage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
            else{
                System.out.println("Somthing Wrong Try Again");
            }
            if(UserComboBox.getSelectionModel().getSelectedItem().equals("Admin") && Username.equalsIgnoreCase("Admin") && Password.equalsIgnoreCase("44444")){
                 System.out.println("Successfully Login");
                 Parent userScene = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
            else{
                System.out.println("Somthing Wrong Try Again");
            }
      }
      
    }

    @FXML
    private void Combo(ActionEvent event) {
    }
}
   
   