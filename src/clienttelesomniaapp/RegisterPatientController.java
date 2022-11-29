/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttelesomniaapp;

/**
 *
 * @author agarc
 */

import static clienttelesomniaapp.LogInPatientController.infoMessage;
import java.io.File;
import java.net.URL;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import pojos.Patient;
import patientUtilities.Menu;

public class RegisterPatientController {

    @FXML
    private TextField txtname;

    @FXML
    private ChoiceBox<String> genderChoiceBox;

    @FXML
    private Button registerPatientButton;

    @FXML
    private TextField txtdob;

    @FXML
    private Button backMenuButton;

    @FXML
    private Label nameError;

    @FXML
    private Label ageError;

    @FXML
    private TextField txtsurname;

    @FXML
    private TextField txtaddress;

    @FXML
    private TextField txtemail;
    
    @FXML
    private TextField txtId;

    @FXML
    private TextField txtmacAddress;

    @FXML
    private TextField txtdiagnosis;

    @FXML
    private TextField txtmedCardNumber;

    @FXML
    private TextField txtallergies;

    @FXML
    private Button exitButton;

    @FXML
    void registerPatientButton(ActionEvent event) throws Exception {
        Window owner = registerPatientButton.getScene().getWindow();
        ObservableList<String> genderList = FXCollections.observableArrayList("Male", "Female");
        genderChoiceBox.setItems(genderList);
        genderChoiceBox.setValue("Male");
        
        String name = txtname.getText();
        String surname = txtsurname.getText();
        Integer patientId = Integer.parseInt(txtId.getText());
        String email = txtemail.getText();
        String address = txtaddress.getText();
        String diagnosis = txtdiagnosis.getText();
        String gender = genderChoiceBox.getValue();
        Date dob = new Date(txtdob.getText());
        Integer medCard = Integer.parseInt(txtmedCardNumber.getText());
        String allergies = txtallergies.getText();
        String macAddress = txtmacAddress.getText();
        //Patient p = new Patient(name, surname, medical_card_number, dob, address, email, diagnosis, allergies, gender, userId, macAddress);
        String usernamePass = Menu.registerPatient(name, surname, medCard, dob, address, email, diagnosis, allergies, gender, medCard, macAddress);
        
        if(usernamePass==null){
             infoMessage("Please enter the data correctly", null, "Failed");
        }else{
             try{
                showAlert2(Alert.AlertType.INFORMATION, owner,"Your Username and Password are",usernamePass);
                URL url = new File("src/doctorapp/menuDoctor.fxml").toURI().toURL();
                Parent root = FXMLLoader.load(url);    
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

                stage.setScene(scene);
                stage.show();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @FXML
    void backMenuButton(ActionEvent event) {

    }
    
    @FXML
    void exitButton(ActionEvent event) {

    }

}

