/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttelesomniaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author agarc
 */
public class PantallaInicialController {
     @FXML
    private Button patientButton;

    @FXML
    private Button doctorButton;
    
    @FXML
    void doctorConnection(ActionEvent event) {

    }

    @FXML
    void patientConnection(ActionEvent event) {
        try{
	  Parent root = FXMLLoader.load(getClass().getResource("patientAccess.fxml")); 
	  Scene scene = new Scene(root);
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		
	  stage.setScene(scene);
	  stage.show();
	  } catch(Exception e) {
	  	e.printStackTrace();
	  }

    }

    }



