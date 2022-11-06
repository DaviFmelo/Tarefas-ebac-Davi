package Tests.services;

import Dao.IClienteDao;
import DaoMock.ClienteDaoMock;
import domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.ClienteService;
import services.IClienteService;
import Exception.ChaveNãoEncontrada;

public class ClienteServiceTest {
    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        Cliente cliente = new Cliente();
        cliente.setCpf(1234567L);
        cliente.setNome("Davi");
        cliente.setCidade("Rio de janeiro");
        cliente.setEnd("Endereço");
        cliente.setEstado("RJ");
        cliente.setNumero(20);
        cliente.setTel(46744632L);
    }
    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = new buscarPorCPF(1234567L);
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() throws ChaveNãoEncontrada {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(1234567L);
    }

    @Test
    public void alterarCliente() throws ChaveNãoEncontrada {
        clienteService.alterar(cliente);
        this.cliente = new Cliente();
        cliente.setNome("Davi");
        String alterar = cliente.getNome();

        Assert.assertEquals("Davi", alterar);
    }
}
