package Generics;

import Annotation.Continuo;
import Exception.ChaveNãoEncontrada;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDao <T extends Continuo, E extends Serializable> {

    public Boolean cadastrar(T entity) throws ChaveNãoEncontrada;

    public void excluir(E valor);

    public void alterar(T entity) throws ChaveNãoEncontrada;

    public T consultar(E valor);

    public Collection<T> buscarTodos();
}
