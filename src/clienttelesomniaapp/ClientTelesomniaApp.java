/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttelesomniaapp;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author agarc
 */
public class ClientTelesomniaApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        URL url = new File("src/clienttelesomniaapp/inicio.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
       //Parent root = FXMLLoader.load(getClass().getResource("inicio.fxml"));


        
        
        

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
       
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
