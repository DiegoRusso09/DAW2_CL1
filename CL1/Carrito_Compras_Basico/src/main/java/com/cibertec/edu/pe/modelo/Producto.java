package com.cibertec.edu.pe.modelo;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	private String Id;
	private String nombre;
	private String descripcion;
	private String url;
	private Double precio;
	public Producto() {
	}
	public Producto(String nombre, String descripcion, String url, Double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
		this.precio = precio;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
