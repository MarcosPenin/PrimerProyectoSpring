package com.cursospring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludador=null;
		
	//saludador=(Saludator) appContext.getBean("saludator");
		
	//	saludador=appContext.getBean("saludator",Saludator.class);
		
	 	saludador=appContext.getBean(Saludator.class);
			
		System.out.println(saludador.saludo()+"\n");
		
		
		EmailService emailService=null;
		
		emailService=appContext.getBean(EmailService.class);
		emailService.enviarEmailSaludo("marcospenin@prueba.com");		
		
						
		((ClassPathXmlApplicationContext) appContext).close();
	

	}

}
