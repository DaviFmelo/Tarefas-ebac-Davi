package Generics;

import Exception.ChaveNãoEncontrada;
import Exception.DAOException;
import Exception.MaisDeUmRegistroException;
import Exception.TableException;

import java.io.Serializable;
import java.util.Collection;

import Dao.Persistente;

public interface IGenericDao <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws ChaveNãoEncontrada, DAOException;

    public void excluir(E valor) throws DAOException, DAOException;

    public void alterar(T entity) throws ChaveNãoEncontrada, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException, TableException;

    public Collection<T> buscarTodos() throws DAOException;
}
