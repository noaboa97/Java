package application.javafxdemotwoviews;

import java.io.IOException;

import application.javafxdemotwoviews.ResultatController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private TextField txtZahl1;
	
	@FXML
	private TextField txtZahl2;
	
	@FXML
	public void onCalc(ActionEvent event) {
		String z1 = this.txtZahl1.getText();
		String z2 = txtZahl2.getText();
		double zahl1 = Double.parseDouble(z1);
		double zahl2 = Double.parseDouble(z2);
	
		this.loadNextView(zahl1, zahl2);
	}

	private void loadNextView(double zahl1, double zahl2) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ResultatView.fxml"));
		try {
			Parent root = fxmlLoader.load();
			ResultatController resController = fxmlLoader.getController();
			resController.registerPrevScene(txtZahl1.getScene());	
			resController.setValues(zahl1, zahl2);
			Stage s = (Stage) txtZahl1.getScene().getWindow();
			Scene scene = new Scene(root);
			s.setScene(scene);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}