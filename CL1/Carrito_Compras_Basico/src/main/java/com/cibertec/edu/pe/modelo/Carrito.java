package com.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {
	@Id
	private int linea;
	private String articulo;
	private String descripcion;
	private int cantidad;
	private Double precio;
	public Carrito() {
	}
	public Carrito(int linea, String articulo, String descripcion, int cantidad, Double precio) {
		this.linea = linea;
		this.articulo = articulo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public int getLinea() {
		return linea;
	}
	public void setLinea(int linea) {
		this.linea = linea;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
