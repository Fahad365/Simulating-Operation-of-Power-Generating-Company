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
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UploadInvoiceListController implements Initializable {
      ObservableList list=FXCollections.observableArrayList();
 
    @FXML
    private Button Upload;
    @FXML
    private Button Back;
    @FXML
    private ListView<String> textList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       loadData();
    } 
    private void loadData(){
        list.removeAll(list);
        String a="Invoice List 1";
        String b="Invoice List 2";
        String c="Invoice List 3";
        String d="Invoice List 4";
        String e="Invoice List 5";
        list.addAll(a,b,c,d,e);
        textList.getItems().addAll(list);
    }

    @FXML
    private void UploadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("SuppliareHomePage.fxml"));
        Scene newUserScene =new Scene(userScene);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newUserScene);
        window.show();
    }
    
}
