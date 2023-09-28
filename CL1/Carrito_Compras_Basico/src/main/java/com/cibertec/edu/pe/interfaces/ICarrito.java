package com.cibertec.edu.pe.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.pe.modelo.Carrito;

@Repository
public interface ICarrito  extends JpaRepository<Carrito, String>{

}
