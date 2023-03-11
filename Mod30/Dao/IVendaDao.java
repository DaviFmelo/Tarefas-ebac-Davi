/**
 * 
 */
package Dao;

import Exception.ChaveNãoEncontrada;
import Exception.DAOException;
import Generics.IGenericDao;
import domain.Venda;

/**
 * @author Davi
 *
 */
public interface IVendaDao extends IGenericDao<Venda, String> {

	public void finalizarVenda(Venda venda) throws ChaveNãoEncontrada, DAOException;
	
	public void cancelarVenda(Venda venda) throws ChaveNãoEncontrada, DAOException;
}