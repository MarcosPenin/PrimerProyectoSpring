package com.cursospring.spring;

public class Saludator {

		
	public String mensaje;
	
	
	public void setMensaje(String str) {
		this.mensaje = str;
	}
	
	public String saludo() {
		return (mensaje==null)? "Hello Spring" :mensaje;
	}
	

	

}
