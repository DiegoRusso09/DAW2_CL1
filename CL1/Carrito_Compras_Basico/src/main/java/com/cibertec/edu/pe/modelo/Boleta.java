package com.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boleta")
public class Boleta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int idLinea;
	private String articulo;
	private int cantidad;
	private Double total;
	public Boleta() {
	}
	public Boleta(int idLinea, String articulo, int cantidad, Double total) {
		this.idLinea = idLinea;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.total = total;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getIdLinea() {
		return idLinea;
	}
	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
}
