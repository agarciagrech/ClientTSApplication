/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttelesomniaapp;

import com.sun.jmx.snmp.daemon.CommunicatorServer;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import patientUtilities.Menu;


/**
 *
 * @author agarc
 */
public class InicioTSAppController {
    public static String ipAdress;
    public static Socket socket;
    
    @FXML
    private Button logInButton;
    
    @FXML
    private Button ExitServer;
    
    @FXML
    private Button Register;
    
    @FXML
    private TextField addressIP;
    @FXML
    private void logIn(ActionEvent event) throws IOException{
        ipAdress = addressIP.getText();
        Menu.initiliazeStreams(ipAdress);
        URL url = new File("src/clienttelesomniaapp/logInPatient.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void Register(ActionEvent event) throws IOException{
        ipAdress = addressIP.getText();
        Menu.initiliazeStreams(ipAdress);
        URL url = new File("src/clienttelesomniaapp/patientRegister.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void exitServer(ActionEvent event) {
        try{
            socket.close();
        }catch(IOException ex){
             Logger.getLogger(InicioTSAppController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    
}
