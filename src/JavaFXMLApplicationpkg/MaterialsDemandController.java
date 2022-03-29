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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MaterialsDemandController implements Initializable {

    @FXML
    private ComboBox<String> RawMaterialsCombo;
    @FXML
    private Button Fulfillthedemand;
    @FXML
    private Button NotOnStock;
    @FXML
    private Button BackHomePage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RawMaterialsCombo.getItems().addAll("Coal","Oil","Gas","Hydro");
    }    

    @FXML
    private void FulfillthedemandButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void NotOnStockButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackHomePageButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("SuppliareHomePage.fxml"));
        Scene newUserScene =new Scene(userScene);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newUserScene);
        window.show();
    }
    
}
