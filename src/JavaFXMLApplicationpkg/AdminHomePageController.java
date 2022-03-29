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
public class AdminHomePageController implements Initializable {

    @FXML
    private Button ScheduleMeeting;
    @FXML
    private Button ShowQueries;
    @FXML
    private Button UpdateCompanyPolicy;
    @FXML
    private Button CreateTrainingProgram;
    @FXML
    private Button CreateHolidayList;
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
    private void ScheduleMeetingButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==ScheduleMeeting){
            Parent userScene = FXMLLoader.load(getClass().getResource("ScheduleMeeting.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void ShowQueriesButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==ShowQueries){
            Parent userScene = FXMLLoader.load(getClass().getResource("ShowQueries.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void UpdateCompanyPolicyButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==UpdateCompanyPolicy){
            Parent userScene = FXMLLoader.load(getClass().getResource("UpdateCompanyPolicy.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }

    @FXML
    private void CreateTrainingProgramButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==CreateTrainingProgram){
            Parent userScene = FXMLLoader.load(getClass().getResource("CreateTrainingProgram.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void CreateHolidayListButtonOnClick(ActionEvent event) throws IOException {
        if(event.getSource()==CreateHolidayList){
            Parent userScene = FXMLLoader.load(getClass().getResource("CreateHolidayList.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    }
    @FXML
    private void LogOutButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("UserLoginPage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    
}
