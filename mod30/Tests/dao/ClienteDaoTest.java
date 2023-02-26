package Tests.dao;

import Dao.ClienteDao;
import Dao.IClienteDao;
import domain.Cliente;
import Exception.ChaveNãoEncontrada;
import Exception.DAOException;
import Exception.MaisDeUmRegistroException;
import Exception.TableException;

import org.junit.Assert;
import org.junit.After;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

/**
 * @author Davi
 *
 */
public class ClienteDaoTest {
	
	private IClienteDao clienteDao;

	public ClienteDaoTest() {
		clienteDao = new ClienteDao();
	}
	
	@After
	public void end() throws DAOException {
		Collection<Cliente> list = clienteDao.buscarTodos();
		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli.getCpf());
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	@Test
	public void pesquisarCliente() throws MaisDeUmRegistroException, TableException, ChaveNãoEncontrada, DAOException {
		Cliente cliente = new Cliente();
		cliente.setCpf(435332742347L);
		cliente.setTelefone(214234234243L);
		cliente.setNome("Davi");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEndereco("End");
		cliente.setEstado("RJ");
		cliente.setNumero(42);
		cliente.setId(943857832642L);
		clienteDao.cadastrar(cliente);
		
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void salvarCliente() throws ChaveNãoEncontrada, MaisDeUmRegistroException, TableException, DAOException {
		Cliente cliente = new Cliente();
		cliente.setCpf(435332742347L);
		cliente.setTelefone(214234234243L);
		cliente.setNome("Davi");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEndereco("End");
		cliente.setEstado("RJ");
		cliente.setNumero(42);
		cliente.setId(943857832642L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
		
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		
		clienteDao.excluir(cliente.getCpf());
	}
	
	
	@Test
	public void excluirCliente() throws ChaveNãoEncontrada, MaisDeUmRegistroException, TableException, DAOException {
		Cliente cliente = new Cliente();
		cliente.setCpf(435332742347L);
		cliente.setTelefone(214234234243L);
		cliente.setNome("Davi");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEndereco("End");
		cliente.setEstado("RJ");
		cliente.setNumero(42);
		cliente.setId(943857832642L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
		
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		
		clienteDao.excluir(cliente.getCpf());
		clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNull(clienteConsultado);
	}
	
	@Test
	public void alterarCliente() throws ChaveNãoEncontrada, MaisDeUmRegistroException, TableException, DAOException {
		Cliente cliente = new Cliente();
		cliente.setCpf(435332742347L);
		cliente.setTelefone(214234234243L);
		cliente.setNome("Davi");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEndereco("End");
		cliente.setEstado("RJ");
		cliente.setNumero(42);
		cliente.setId(943857832642L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
		
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		
		clienteConsultado.setNome("Davi");
		clienteDao.alterar(clienteConsultado);
		
		Cliente clienteAlterado = clienteDao.consultar(clienteConsultado.getCpf());
		Assert.assertNotNull(clienteAlterado);
		Assert.assertEquals("Davi", clienteAlterado.getNome());
		
		clienteDao.excluir(cliente.getCpf());
		clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNull(clienteConsultado);
	}
	
	@Test
	public void buscarTodos() throws ChaveNãoEncontrada, DAOException {
		Cliente cliente = new Cliente();
		cliente.setCpf(435332742347L);
		cliente.setTelefone(214234234243L);
		cliente.setNome("Davi");
		cliente.setCidade("Rio de Janeiro");
		cliente.setEndereco("End");
		cliente.setEstado("RJ");
		cliente.setNumero(42);
		cliente.setId(943857832642L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
		
		Cliente cliente1 = new Cliente();
		cliente1.setCpf(23454353453L);
		cliente.setTelefone(2131312313L);
		cliente1.setNome("João");
		cliente1.setCidade("São Paulo");
		cliente1.setEndereco("End");
		cliente1.setEstado("SP");
		cliente1.setNumero(12);
		cliente1.setId(98292133L);
		Boolean retorno1 = clienteDao.cadastrar(cliente1);
		Assert.assertTrue(retorno1);
		
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
		
		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli.getCpf());
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Collection<Cliente> list1 = clienteDao.buscarTodos();
		assertTrue(list1 != null);
		assertTrue(list1.size() == 0);
	}
}