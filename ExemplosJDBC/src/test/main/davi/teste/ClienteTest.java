/**
 * 
 */
package davi.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import davi.dao.ClienteDAO;
import davi.dao.IClienteDAO;
import davi.domain.Cliente;

/**
 * @author Davi
 *
 */
public class ClienteTest {
	
	@Test
	public void cadastrarTest() throws Exception {
		
		//Cadastrar Cliente
		
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setId(8l);
		cliente.setCpf(47690);
		cliente.setNome("João");
		cliente.setIdade(20);
		cliente.setSexo("M");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		//Consultar Cliente
		
		Cliente clienteBD = dao.consultar(cliente.getId());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getId(), clienteBD.getId());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		//Alterar Cliente
		
		@SuppressWarnings("unused")
		Integer alterar  = dao.alterar(clienteBD);
	
		
		//Buscar Todos os Clientes
		
		@SuppressWarnings("unused")
		List <Cliente> buscarTodos = dao.buscarTodos();
		
		//Excluir Cliente
		
				Integer qtdDel = dao.excluir(clienteBD);
				assertNotNull(qtdDel);
	}     
}
