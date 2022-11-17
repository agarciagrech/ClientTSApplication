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
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ShowSignalsController {

    @FXML
    private TableView<?> signalTable;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private Button showSignalButton;

    @FXML
    private Button exitButton;

    @FXML
    private LineChart<?, ?> SignalGraph;

    

    @FXML
    void exitApp(ActionEvent event) {

    }

    @FXML
    void showSignal(ActionEvent event) {

    }

}

