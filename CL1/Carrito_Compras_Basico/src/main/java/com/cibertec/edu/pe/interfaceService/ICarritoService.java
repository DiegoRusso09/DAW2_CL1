package com.cibertec.edu.pe.interfaceService;

import java.util.List;

import com.cibertec.edu.pe.modelo.Carrito;

public interface ICarritoService {
	public List<Carrito> Listar();
	public void Suprimir(String Id);
}
