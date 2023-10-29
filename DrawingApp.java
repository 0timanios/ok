package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

@SpringBootApplication
public class DrawingApp {

	public static void main(String[] args) {
		SpringApplication.run(DrawingApp.class, args);
		// Triangle triangle = new Triangle();
		BeanFactory fact = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		new Triangle().draw();
	}

}
