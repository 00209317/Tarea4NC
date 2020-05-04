package com.uca.capas.modelo.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	
	@Pattern(regexp="[0-9]{12}", message="Código debe ser de 12 dígitos")
	String codigo_Proc;
	
	@Size(min=1, max=100, message="Nombre Producto debe ser menor o igual a 100")
	String nombre_Proc;
	
	@Size(min=1, max=100, message="Marca debe ser menor o igual a 100")
	String marca;
	
	@Size(min=1, max=500, message="Descripción debe ser menor o igual a 500")
	String descripcion;
	
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="No se permite un numero decimal")
	String existencias;
	
	@Pattern(regexp = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$",message="La fecha debe de ser ser en formato DD/MM/YYYY")
	String fecha;

	public String getCodigo_Proc() {
		return codigo_Proc;
	}

	public void setCodigo_Proc(String codigo_Proc) {
		this.codigo_Proc = codigo_Proc;
	}

	public String getNombre_Proc() {
		return nombre_Proc;
	}

	public void setNombre_Proc(String nombre_Proc) {
		this.nombre_Proc = nombre_Proc;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}
