/**
 * 
 */
package davi.dao;

import java.util.List;

import davi.domain.Cliente;

/**
 * @author Davi
 *
 */
public interface IClienteDAO {
	
	public Integer cadastrar(Cliente cliente) throws Exception;
	
	public Integer alterar(Cliente cliente) throws Exception;

	public Cliente consultar(Long id) throws Exception;
	
	public List <Cliente> buscarTodos() throws Exception;
	
	public Integer excluir(Cliente clienteBD) throws Exception;
}
