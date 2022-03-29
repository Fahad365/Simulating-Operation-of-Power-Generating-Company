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
public class BuyerHomePageController implements Initializable {

    @FXML
    private Button TotalProduction;
    @FXML
    private Button ProductionSchedule;
    @FXML
    private Button ProductPrice;
    @FXML
    private Button ProductDemandandConfirmOrder;
    @FXML
    private Button GiveFeedback;
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
    private void TotalProductionOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==TotalProduction){
            Parent userScene = FXMLLoader.load(getClass().getResource("TotalProduction.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void ProductionScheduleButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==ProductionSchedule){
            Parent userScene = FXMLLoader.load(getClass().getResource("ProductionSchedule.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void ProductPriceButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==ProductPrice){
            Parent userScene = FXMLLoader.load(getClass().getResource("ProductPrice.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void ProductDemandandConfirmOrderButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==ProductDemandandConfirmOrder){
            Parent userScene = FXMLLoader.load(getClass().getResource("ProductDemandandConfirmOrder.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void GiveFeedbackButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==GiveFeedback){
            Parent userScene = FXMLLoader.load(getClass().getResource("GiveFeedback.fxml"));
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
