package application.javafxdemotwoviews;

import application.javafxdemotwoviews.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ResultatController {
	
	@FXML
	private Label lblZahl1;
	
	@FXML
	private Label lblZahl2;
	
	@FXML
	private Label lblResultat;
	
	private Scene prevScene;
	
	@FXML
	public void prev(ActionEvent event) {
		Stage stage = (Stage) lblResultat.getScene().getWindow();
		stage.setScene(this.prevScene);
	}
	
	public void registerPrevScene(Scene s) {
		this.prevScene = s;
	}
	
	public void setValues(double a, double b) {
		Calculator c = new Calculator(a, b);
		lblZahl1.setText(String.valueOf(a));
		lblZahl2.setText(String.valueOf(b));
		lblResultat.setText(String.valueOf(c.sum()));
	}
}