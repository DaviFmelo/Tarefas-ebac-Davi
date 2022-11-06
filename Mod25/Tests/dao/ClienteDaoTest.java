package Tests.dao;

import Dao.ClienteDao;
import Dao.IClienteDao;
import domain.Cliente;
import Exception.ChaveNãoEncontrada;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

/**
 * @author Davi
 *
 */
public class ClienteDaoTest {

    private IClienteDao clienteDao;

    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteDao();
    }

    @Before
    public void init() throws ChaveNãoEncontrada {
        cliente = new Cliente();
        cliente.setCpf(1234567L);
        cliente.setNome("Davi");
        cliente.setCidade("Rio de janeiro");
        cliente.setEnd("Endereço");
        cliente.setEstado("RJ");
        cliente.setNumero(20);
        cliente.setTel(46744632L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws ChaveNãoEncontrada {
        cliente.setCpf(56565656565L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);
    }


    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws ChaveNãoEncontrada {
        cliente.setNome("Rodrigo Pires");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }

    @Test
    public void buscarTodos() {
        Collection<Cliente> list = clienteDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);
    }
}
