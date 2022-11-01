package Test;

import Service.ClienteService;
import dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvar(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void buscar(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String buscar = clienteService.buscar();
        Assert.assertEquals("Buscando CPF", buscar);
    }
    @Test
    public void excluir(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String excluir = clienteService.excluir();
        Assert.assertEquals("Excluindo usuário", excluir);
    }
    @Test
    public void atualizar(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String atualizar = clienteService.atualizar();
        Assert.assertEquals("Atualizando o cadastro", atualizar);
    }
}
