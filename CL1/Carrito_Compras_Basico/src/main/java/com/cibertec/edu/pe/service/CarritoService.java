package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.interfaceService.ICarritoService;
import com.cibertec.edu.pe.interfaces.ICarrito;
import com.cibertec.edu.pe.modelo.Carrito;

@Service
public class CarritoService implements ICarritoService{

	@Autowired
	private ICarrito data;
	
	@Override
	public List<Carrito> Listar() {
		return (List<Carrito>)data.findAll();
	}

	@Override
	public void Suprimir(String Id) {
		data.deleteById(Id);
	}

}
