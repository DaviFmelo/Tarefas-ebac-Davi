package Generics;

import java.io.Serializable;
import java.util.Collection;

import Annotation.Continuo;
import Exception.ChaveNãoEncontrada;
/**
 * @author Davi
 *
 */
public abstract class GenericService<T extends Continuo, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDao<T,E> dao;

    public GenericService(IGenericDao<T,E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws ChaveNãoEncontrada {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws ChaveNãoEncontrada {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}
