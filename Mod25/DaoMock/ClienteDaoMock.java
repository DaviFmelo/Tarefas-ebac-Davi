package DaoMock;

import domain.Cliente;
import Exception.ChaveNãoEncontrada;
import Dao.IClienteDao;
import java.util.Collection;

/**
 * @author Davi
 *
 */
public class ClienteDaoMock implements IClienteDao {

    @Override
    public Boolean cadastrar(Cliente entity) throws ChaveNãoEncontrada {
        return true;
    }

    @Override
    public void excluir(Long valor) {
    }

    @Override
    public void alterar(Cliente entity) throws ChaveNãoEncontrada {
    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
