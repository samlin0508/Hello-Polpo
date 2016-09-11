package com.polpolink.hellopolpofx;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.polpolink.hellopolpo.service.HelloPolpoService;
import com.polpolink.hellopolpo.service.IHelloPolpoService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloPolpoFXController {
	private IHelloPolpoService helloPolpoService;
	@FXML
	private TextField name;
	@FXML
	private Label message;
	
	public HelloPolpoFXController() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core-config.xml");
		this.helloPolpoService = (IHelloPolpoService)context.getBean("helloPolpoService");
	}
	
	@FXML
	private void initialize() {
	}
	
	@FXML
	private void hello() {
		this.message.setText(this.helloPolpoService.hello(this.name.getText()));
	}
}
