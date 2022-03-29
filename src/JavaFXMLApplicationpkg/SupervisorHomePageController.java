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
public class SupervisorHomePageController implements Initializable {

    @FXML
    private Button CheckAttendanceDetails;
    @FXML
    private Button SetSchedule;
    @FXML
    private Button ProductsInvoiceList;
    @FXML
    private Button PlaceOrdertoSupplier;
    @FXML
    private Button CreateProductionReport;
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
    private void CheckAttendanceDetailsButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==CheckAttendanceDetails){
            Parent userScene = FXMLLoader.load(getClass().getResource("CheckAttendanceDetails.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void SetScheduleButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==SetSchedule){
            Parent userScene = FXMLLoader.load(getClass().getResource("SetSchedule.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void ProductsInvoiceListButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==ProductsInvoiceList){
            Parent userScene = FXMLLoader.load(getClass().getResource("ProductsInvoiceList.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void PlaceOrdertoSupplierButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==PlaceOrdertoSupplier){
            Parent userScene = FXMLLoader.load(getClass().getResource("PlaceOrdertoSupplier.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void CreateProductionReportButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==CreateProductionReport){
            Parent userScene = FXMLLoader.load(getClass().getResource("CreateProductionReport.fxml"));
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
