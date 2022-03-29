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
public class ShowQueriesController implements Initializable {
ObservableList list=FXCollections.observableArrayList();
    @FXML
    private ListView<String> QueriList;
    @FXML
    private Button ReplyQueri;
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
        String a="Queri:1-Issue-from-supervisor";
        String b="Queri:2-Issue-from-accounts";
        String c="Queri:3-Issue-from-buyer";
        String d="Queri:4-Issue-from-supervisor";
        String e="Queri:5-Issue-from-buyer";
        list.addAll(a,b,c,d,e);
        QueriList.getItems().addAll(list);
    }
    @FXML
    private void ReplyQueriButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("ReplyQueri.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent userScene = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
                 Scene newUserScene =new Scene(userScene);
                 Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(newUserScene);
                 window.show();
    }
    
}
