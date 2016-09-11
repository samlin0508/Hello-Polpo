package com.polpolink.hellopolpofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloPolpoFXController {
	@FXML
	private TextField name;
	@FXML
	private Label message;
	
	public HelloPolpoFXController() {
	}
	
	@FXML
	private void initialize() {
	}
	
	@FXML
	private void hello() {
		this.message.setText("Hello, " + this.name.getText());
	}
}
