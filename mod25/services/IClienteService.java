package services;

import domain.Cliente;
import Exception.ChaveNãoEncontrada;

/**
 * @author Davi
 *
 */
public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws ChaveNãoEncontrada;
    Cliente buscarPorCPF(Long cpf);
    void excluir(Long cpf);
    void alterar(Cliente cliente) throws ChaveNãoEncontrada;
}
