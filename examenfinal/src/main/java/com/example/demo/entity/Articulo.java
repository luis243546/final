package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="articulo")
@Entity(name="Articulo")
public class Articulo {

	@Id
	String articulo;
	String categoria;
	String codigo;
	String nombre;
	int Stock;
	String descripcion;
	String imagen;
	String estado;
	
	public Articulo() {}

	public Articulo(String articulo, String categoria, String codigo, String nombre, int stock, String descripcion,
			String imagen, String estado) {
		super();
		this.articulo = articulo;
		this.categoria = categoria;
		this.codigo = codigo;
		this.nombre = nombre;
		Stock = stock;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
