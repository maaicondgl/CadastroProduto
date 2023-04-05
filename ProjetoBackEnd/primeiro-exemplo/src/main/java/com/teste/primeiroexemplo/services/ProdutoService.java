package com.teste.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
  
       /**
      * metodo para retornar lista de produtos
       * @return retorna lista de produtos
       */
  
      public List<Produto> obterTodos(){
         return produtoRepository.findAll();
      }
  
          /**
       * metodo que retorn o produto encontrado pelo ID
       * @param id do produto que sera localizado
       * @return retorna um produto caso tenha encontrado
       */
  
      public  Optional <Produto> obterPorId(Integer id){
          return produtoRepository.findById(id);
      }
          /**
       * metodo para adicionar produto na lista.
       * @param produto que sera adicionado.
       * @return retorna o produto que foi adicionado na lista.
       */
      public Produto adicionar(Produto produto){
         return produtoRepository.save(produto);
      }
  
  
      /**
       * metodo para deletar o produto  por ID
       * @param id do produto a ser deletado.
       */
      public void deletar(Integer id){
          produtoRepository.deleteById(id);;
      }
  
      /**
       * metodo para atualizar o produto na lista
       * @param produto produto a ser atualizado
       * @return retorna o produto atualizado
       */
      public Produto atualizar ( Integer id, Produto produto){
      
        produto.setId(id);
  
        return produtoRepository.save(produto);
  
      }
   
}
