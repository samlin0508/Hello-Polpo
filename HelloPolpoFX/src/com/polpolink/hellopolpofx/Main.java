package com.polpolink.hellopolpofx;
	
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static final SpringFxmlLoader loader = new SpringFxmlLoader();

	@Override
	public void start(Stage primaryStage) {
		try {
			//VBox root = (VBox)FXMLLoader.load(getClass().getResource("HelloPolpoFX.fxml"));
			VBox root = (VBox)loader.load("HelloPolpoFX.fxml");
			Scene scene = new Scene(root,250,250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
