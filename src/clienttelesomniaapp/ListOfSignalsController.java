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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ListOfSignalsController {

    @FXML
    private TableView<?> patientTable;

    @FXML
    private TableColumn<?, ?> medCardCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> surnameCol;


    @FXML
    private Button editButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button showSignals;

    @FXML
    void editPatient(ActionEvent event) {

    }

    @FXML
    void exitApp(ActionEvent event) {

    }


    

    @FXML
    void showPatientSignals(ActionEvent event) {

    }

}

