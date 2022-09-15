package com.example.javafxlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField txtBenutzername;
	
	@FXML
	private TextField txtPasswort;
	
	@FXML
	private Label lblBenutzername;
	
	@FXML
	private Label lblPasswort;
	
	@FXML
	private Label lblClicks;
	
	private int loginCounter;
	
	@FXML
	protected void onLogin(ActionEvent event) {
		loginCounter++;
		this.lblBenutzername.setText(this.txtBenutzername.getText());
		this.lblPasswort.setText(this.txtPasswort.getText());
		this.lblClicks.setText(String.valueOf(loginCounter));
	}
}
