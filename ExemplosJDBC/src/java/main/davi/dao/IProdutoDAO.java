/**
 * 
 */
package davi.dao;

import java.util.List;

import davi.domain.Produto;

/**
 * @author Davi
 *
 */
public interface IProdutoDAO {
	
	public Integer cadastrarProduto(Produto produto) throws Exception;
	
	public Integer alterarProduto(Produto produtoBD) throws Exception;
	
	public Produto consultarProduto(Long id) throws Exception;
	
	public List <Produto> buscarTodos() throws Exception;
	
	public Integer excluir(Produto produtoBD) throws Exception;
}
