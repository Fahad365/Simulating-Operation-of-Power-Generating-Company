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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SuppliareHomePageController implements Initializable {

    @FXML
    private Button MaterialsDemand;
    @FXML
    private Button SetthePrice;
    @FXML
    private Button UploadInvoiceList;
    @FXML
    private Button TransportingService;
    @FXML
    private Button Feedback;
    @FXML
    private Button LogOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MaterialsDemandButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==MaterialsDemand){
            Parent userScene = FXMLLoader.load(getClass().getResource("MaterialsDemand.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
        }
        }
  
    @FXML
    private void SetthePriceButtonOnClick(ActionEvent event) throws IOException{
         if(event.getSource()==SetthePrice){
             Parent userScene = FXMLLoader.load(getClass().getResource("PriceDeterminingPage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
         }
    }
    @FXML
    private void UploadInvoiceListButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==UploadInvoiceList){
            Parent userScene = FXMLLoader.load(getClass().getResource("UploadInvoiceList.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
        }
    }
    

    @FXML
    private void TransportingServiceButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==TransportingService){
            Parent userScene = FXMLLoader.load(getClass().getResource("TransportingService.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void FeedbackButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==Feedback){
            Parent userScene = FXMLLoader.load(getClass().getResource("SeeFeedback.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void LogOutButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==LogOut){
            Parent userScene = FXMLLoader.load(getClass().getResource("UserLoginPage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    
}
