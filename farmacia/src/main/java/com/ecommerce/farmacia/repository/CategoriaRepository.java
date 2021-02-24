package com.ecommerce.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByCategoriaFarmaciaContainingIgnoreCase(String categoriaFarmacia);
	


}
