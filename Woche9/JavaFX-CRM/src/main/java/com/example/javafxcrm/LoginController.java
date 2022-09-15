package com.example.javafxcrm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CRMView.fxml"));
			Parent root = fxmlLoader.load();
			CrmController crmController = fxmlLoader.getController();

			crmController.registerPrevScene(txtBenutzername.getScene());

			crmController.setUsername(this.txtBenutzername.getText());

			Stage s = (Stage) txtBenutzername.getScene().getWindow();

			s.setTitle("CRM");
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
			s.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
