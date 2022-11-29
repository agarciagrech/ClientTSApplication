/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttelesomniaapp;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author agarc
 */
public class LogInPatientController {
    
    @FXML
    private Button backMenuButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button logInButton;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    
    @FXML
    void backMenuButton(ActionEvent event) throws MalformedURLException, IOException {
        URL url = new File("src/clienttelesomniaapp/logInPatient.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);    
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void exitButton(ActionEvent event) {

    }

    @FXML
    void logInButton(ActionEvent event) throws IOException{
        Window owner = logInButton.getScene().getWindow();
        if(txtUsername.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your username");
            return;
        }
        if(txtPassword.getText().isEmpty()){
             showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your password");
             return;
        }
        
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        //MANDAR DATOS AL SERVER 
        
        URL url = new File("src/clienttelesomniaapp/logInPatient.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);    
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
    
    public static void infoMessage(String infoMessage, String headerText, String title) {
       Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
           alert.setContentText(infoMessage);
           alert.setTitle(title);
           alert.setHeaderText(headerText);
           alert.showAndWait();
       }

       public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message ) {
       Alert alert = new Alert(alertType);
       alert.setTitle(title);
       alert.setHeaderText(null);
       alert.setContentText(message);
       alert.initOwner(owner);
       alert.show();
       }
   
}
