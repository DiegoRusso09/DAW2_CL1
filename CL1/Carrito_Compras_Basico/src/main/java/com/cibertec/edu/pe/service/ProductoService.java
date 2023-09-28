package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.interfaceService.IProductoSerivce;
import com.cibertec.edu.pe.interfaces.IProducto;
import com.cibertec.edu.pe.modelo.Producto;

@Service
public class ProductoService implements IProductoSerivce{

	@Autowired
	private IProducto data;
	@Override
	public List<Producto> Listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public int Grabar(Producto Obj) {
		int rpta = 0;
		Producto ObjP = data.save(Obj);
		if(!ObjP.equals(null))rpta = 1;
		return rpta;
	}

}
