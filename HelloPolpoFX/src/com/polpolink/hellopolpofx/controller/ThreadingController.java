package com.polpolink.hellopolpofx.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.polpolink.hellopolpo.service.IHelloPolpoService;

import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

@Component
public class ThreadingController {
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label message;
	@FXML
	private Button runProgress;
	
	public ThreadingController() {
	}
	
	@FXML
	private void initialize() {
	}
	
	@FXML
	private void runProgress() {
		Task<Void> task = new Task<Void>() {
		    @Override public Void call() {
		        final int max = 10000000;
		        runProgress.setDisable(true);
		        for (int i=1; i<=max; i++) {
		            if (isCancelled()) {
		               break;
		            }
		            updateProgress(i, max);
		            updateMessage(Math.round((i/(float)max) * 100) + "%");
		            if(i == max) {
		            	runProgress.setDisable(false);
		            }
		        }
				return null;
		    }
		};
		this.progressBar.progressProperty().bind(task.progressProperty());
		this.message.textProperty().bind(task.messageProperty());
		new Thread(task).start();
	}
}
