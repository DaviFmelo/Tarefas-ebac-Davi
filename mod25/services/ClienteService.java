package services;

import Dao.IClienteDao;
import Generics.GenericService;
import domain.Cliente;

/**
 * @author Davi
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDao clienteDao) {
        super(clienteDao);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }
}
