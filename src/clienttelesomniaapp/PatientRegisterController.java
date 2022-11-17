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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PatientRegisterController {

    @FXML
    private TextField txtname;

    @FXML
    private ChoiceBox<?> genderChoiceBox;

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
    private ChoiceBox<?> RoleChoiceBox1;

    @FXML
    private TextField txtaddress;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtmacAddress;

    @FXML
    private TextField txtdiagnosis;

    @FXML
    private TextField txtmedCardNumber;

    @FXML
    private TextField txtpassword;

    @FXML
    private Button exitButton;

    @FXML
    void addPatient(ActionEvent event) {

    }

    @FXML
    void backtoMenu(ActionEvent event) {

    }
    
    @FXML
    void exitApp(ActionEvent event) {

    }

}

