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
		Task<String> task = new Task<String>() {
		    @Override public String call() {
		        final int max = 10000000;
		        for (int i=1; i<=max; i++) {
		            if (isCancelled()) {
		               break;
		            }
		            updateProgress(i, max);
		            updateMessage(Math.round((i/(float)max) * 100) + "%");
		            updateValue(String.valueOf(i));
		        }
				return "run";
		    }
		};
		this.runProgress.disableProperty().bind(task.runningProperty());
		this.runProgress.textProperty().bind(task.valueProperty());
		this.progressBar.progressProperty().bind(task.progressProperty());
		this.message.textProperty().bind(task.messageProperty());
		new Thread(task).start();
	}
}
