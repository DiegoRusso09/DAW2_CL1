package com.cibertec.edu.pe.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.pe.modelo.Producto;

@Repository
public interface IProducto  extends JpaRepository<Producto, String>{

}
