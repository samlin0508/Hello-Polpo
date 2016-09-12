package com.polpolink.hellopolpofx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.polpolink.hellopolpo.service.IHelloPolpoService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@Component
public class HelloController {
	@Autowired
	private IHelloPolpoService helloPolpoService;
	@FXML
	private TextField name;
	@FXML
	private Label message;
	
	public HelloController() {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-core-config.xml");
		//this.helloPolpoService = (IHelloPolpoService)context.getBean("helloPolpoService");
	}
	
	@FXML
	private void initialize() {
	}
	
	@FXML
	private void hello() {
		this.message.setText(this.helloPolpoService.hello(this.name.getText()));
	}
}
