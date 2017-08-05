package com.anioranzas.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="usuarios")
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 3743183120177132403L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="codusuario")
	private  Long codusuario;
	
	@Column(name="dni")
	private  int DNI;
	@Column(name="nombre", length=50)
	private String Nombre;
	@Column(name="ap", length=50)
	private String Ap;
	@Column(name="am", length=50)
	private String Am;
	@Column(name="sexo")
	private char Sexo;
	@Column(name="direccion", length=50)
	private String Direccion;
	@Column(name="telefono")
	private int Telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="foto")
	private String Foto;
	@Column(name="estado")
	private int estado;
	@Column(name="nit")
	private int NIT;

	public Usuarios(){}
	public Usuarios (Long codusuario){
		this.codusuario=codusuario;
	}
	public Usuarios (Long codUsuario, int DNI,String Nombre,String Ap,String Am, char Sexo,String Direccion, int Telefono,String correo,String Foto,int estado,int NIT){
		this.codusuario=codUsuario;
		this.DNI=DNI;
		this.Nombre=Nombre;
		this.Ap=Ap;
		this.Am=Am;
		this.Sexo=Sexo;
		this.Direccion=Direccion;
		this.Telefono=Telefono;
		this.correo=correo;
		this.Foto=Foto;
		this.estado=estado;
		this.NIT=NIT;
	}
	
	public Usuarios (int DNI,String Nombre,String Ap,String Am, char Sexo,String Direccion, int Telefono,String correo,String Foto,int estado,int NIT){
		this.DNI=DNI;
		this.Nombre=Nombre;
		this.Ap=Ap;
		this.Am=Am;
		this.Sexo=Sexo;
		this.Direccion=Direccion;
		this.Telefono=Telefono;
		this.correo=correo;
		this.Foto=Foto;
		this.estado=estado;
		this.NIT=NIT;
	}
	public Long getCodUsuario() {
		return codusuario;
	}
	public void setCodUsuario(Long codusuario) {
		this.codusuario=codusuario;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getAp() {
		return Ap;
	}
	public void setAp(String ap) {
		Ap = ap;
	}
	public String getAm() {
		return Am;
	}
	public void setAm(String am) {
		Am = am;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		Foto = foto;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getNIT() {
		return NIT;
	}
	public void setNIT(int nIT) {
		NIT = nIT;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
