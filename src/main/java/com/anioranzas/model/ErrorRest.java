package com.anioranzas.model;

public class ErrorRest {
 private String mensaje;
 public ErrorRest(){}
 
 public ErrorRest(String mensaje){
	 this.mensaje=mensaje;
 }
 public String getMensaje(){
	 return mensaje;
 }
 
}
