package com.cibertec.edu.pe.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.edu.pe.interfaceService.IProductoSerivce;
import com.cibertec.edu.pe.modelo.Producto;

@Controller
public class ProductoControlador {

	@Autowired
	private IProductoSerivce servicio;

	// Método para Listar
	@GetMapping("/index")	// localhost:8080/index
	public String Listado(Model m) {
		List<Producto> lista = servicio.Listar();
		m.addAttribute("productos", lista);
		return "index";	// index
	}
}
