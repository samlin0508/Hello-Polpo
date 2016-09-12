package com.polpolink.hellopolpofx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.polpolink.hellopolpo.service.IHelloPolpoService;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

@Component
public class ThreadingController {
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label message;
	
	public ThreadingController() {
	}
	
	@FXML
	private void initialize() {
	}
	
	@FXML
	private void runProgress() {
		Task task = new Task<Void>() {
		    @Override public Void call() {
		        final int max = 10000000;
		        for (int i=1; i<=max; i++) {
		            if (isCancelled()) {
		               break;
		            }
		            updateProgress(i, max);
		            updateMessage(Math.round((i/(float)max) * 100) + "%");
		            //updateValue(null);
		        }
				return null;
		    }
		};
		this.progressBar.progressProperty().bind(task.progressProperty());
		this.message.textProperty().bind(task.messageProperty());
		new Thread(task).start();
	}
}
