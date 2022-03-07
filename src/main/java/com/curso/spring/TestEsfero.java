package com.curso.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEsfero {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

		Esfero esfero = context.getBean("miEsfero", Esfero.class);

		esfero.verColor();
		
		context.close();

	}

}
