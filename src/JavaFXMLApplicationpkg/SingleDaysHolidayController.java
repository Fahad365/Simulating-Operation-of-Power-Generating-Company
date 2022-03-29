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
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SingleDaysHolidayController implements Initializable {

    @FXML
    private DatePicker Holiday;
    @FXML
    private Button Back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SetDate(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("CreateHolidayList.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    
}
