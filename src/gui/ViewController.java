package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btMyButton;
	
	@FXML
	public void onMyButtonClick() {
		System.out.println("Hello!");
	}
}
