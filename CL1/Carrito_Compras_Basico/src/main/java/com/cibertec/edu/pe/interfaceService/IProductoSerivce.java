package com.cibertec.edu.pe.interfaceService;

import java.util.List;

import com.cibertec.edu.pe.modelo.Producto;

public interface IProductoSerivce {
	public List<Producto> Listar();
	public int Grabar(Producto Obj);
}
