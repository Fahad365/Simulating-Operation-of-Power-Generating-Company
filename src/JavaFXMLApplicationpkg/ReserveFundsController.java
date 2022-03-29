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
public class ReserveFundsController implements Initializable {
ObservableList list=FXCollections.observableArrayList();
    @FXML
    private ListView<String> ReserveFundsList;
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
        String a="2015<>Total Amount= 4000000$";
        String b="2016<>Total Amount= 4200000$";
        String c="2017<>Total Amount= 4500000$";
        String d="2018<>Total Amount= 4300000$";
        String e="2019<>Total Amount= 4700000$";
        String f="2020<>Total Amount= 5000000$";
        String g="2021<>Total Amount= 5300000$";
        list.addAll(a,b,c,d,e,f,g);
        ReserveFundsList.getItems().addAll(list);
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
