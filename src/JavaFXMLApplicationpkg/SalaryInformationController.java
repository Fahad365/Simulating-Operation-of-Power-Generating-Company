/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXMLApplicationpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SalaryInformationController implements Initializable {
ObservableList list=FXCollections.observableArrayList();
    @FXML
    private ListView<String> EmployeeList;
    @FXML
    private Button Back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
    }    
    private void loadData(){
        list.removeAll(list);
        String a="MR.A <> ID: 111 <> Designation: Plant Operator";
        String b="MR.B <> ID: 222 <> Designation: Technician";
        String c="MR.C <> ID: 333 <> Designation: Supervisor";
        String d="MR.D <> ID: 444 <> Designation: HR";
        String e="MR.E <> ID: 555 <> Designation: Dispatcher";
        list.addAll(a,b,c,d,e);
        EmployeeList.getItems().addAll(list);
    }
    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("AccountsandFinanceHomePage.fxml"));
        Scene newUserScene =new Scene(userScene);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newUserScene);
        window.show();
    }
    
}
