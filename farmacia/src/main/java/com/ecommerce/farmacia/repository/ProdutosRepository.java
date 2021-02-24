package com.ecommerce.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.farmacia.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	public List<Produtos> findAllBynomeProdutoContainingIgnoreCase (String nomeProduto);
	
}
