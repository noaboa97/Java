package com.example.javafxcrm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CrmController {

    @FXML
    private Button btnBetrieb;

    @FXML
    private Button btnMitarbeiter;

    @FXML
    private Label lblTitle;

    private Scene prevScene;

    public void registerPrevScene (Scene s){

        this.prevScene = s;

    }

    public void setUsername (String u){
        this.lblTitle.setText("Wilkommen " + u);
    }

    @FXML
    void onBetrieb(ActionEvent event) {

    }

    @FXML
    void onMitarbeiter(ActionEvent event) {

    }

}
