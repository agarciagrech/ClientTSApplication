/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author jaime
 */
public class PatientOptions {

    @FXML
    private Button recordButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button listSignals;

    @FXML
    private Button updateInfoButton;

    @FXML
    void recordButton(ActionEvent event) throws MalformedURLException, IOException {
        URL url = new File("src/clienttelesomniaapp/recordSignals.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);    
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void listSignals(ActionEvent event) throws MalformedURLException, IOException {
        URL url = new File("src/clienttelesomniaapp/listSignals.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);    
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void updateInfoButton(ActionEvent event) throws MalformedURLException, IOException {
        URL url = new File("src/clienttelesomniaapp/updateInfo.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);    
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void exitButton(ActionEvent event) {

    }

}
