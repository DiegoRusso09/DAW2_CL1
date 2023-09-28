package com.cibertec.edu.pe.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.edu.pe.interfaceService.ICarritoService;
import com.cibertec.edu.pe.modelo.Carrito;
import com.cibertec.edu.pe.modelo.Producto;

@Controller
public class CarritoControlador {
	@Autowired
	private ICarritoService servicio;
	
	// Método para Listar
	@GetMapping("/carrito")	// localhost:8080/index
	public String Listado(Model m) {
		List<Carrito> lista = servicio.Listar();
		m.addAttribute("productos", lista);
		return "carrito";	// index
	}
}
