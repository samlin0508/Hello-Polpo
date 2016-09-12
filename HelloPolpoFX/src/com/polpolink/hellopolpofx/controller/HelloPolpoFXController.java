package com.polpolink.hellopolpofx.controller;

import org.springframework.stereotype.Component;

import com.polpolink.hellopolpofx.SpringFxmlLoader;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

@Component
public class HelloPolpoFXController {
	private static final SpringFxmlLoader loader = new SpringFxmlLoader();
	
	@FXML
	private VBox rootVBox;
	
	public HelloPolpoFXController() {
	}
	
	@FXML
	private void initialize() {
	}
	
	@FXML
	private void renderHello() {
		this.rootVBox.getChildren().clear();
		this.rootVBox.getChildren().add((VBox)loader.load("Hello.fxml"));
	}
	
	@FXML
	private void renderThreading() {
		this.rootVBox.getChildren().clear();
		this.rootVBox.getChildren().add((VBox)loader.load("Threading.fxml"));
	}
}
