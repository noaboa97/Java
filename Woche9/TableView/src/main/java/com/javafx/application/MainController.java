package com.javafx.application;

import calculator.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button btnShowLog;

    @FXML
    private Button calc;

    @FXML
    private Label equals;

    @FXML
    private Label lblzahl1;

    @FXML
    private Label lblzahl2;

    @FXML
    private Label result;

    @FXML
    private TextField txtZahl1;

    @FXML
    private TextField txtZahl2;

    @FXML
    void Calculate(ActionEvent event) {

        Calculator calculator = new Calculator(2,2);

    }

    @FXML
    void showLog(ActionEvent event) {

    }

}
