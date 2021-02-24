package com.ecommerce.GamesFlow.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.GamesFlow.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
	public List<Categorias> findAllByNomeCategoriasContainingIgnoreCase (String nomeCategorias);

}
