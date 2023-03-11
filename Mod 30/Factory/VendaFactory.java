/**
 * 
 */
package Factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Cliente;
import domain.Venda;
import domain.Venda.Status;

/**
 * @author Davi
 *
 */
public class VendaFactory {

	public static Venda convert(ResultSet rs) throws SQLException {
		Cliente cliente = ClienteFactory.convert(rs);
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setId(rs.getLong("ID_VENDA"));
		venda.setCodigo(rs.getString("CODIGO"));
		venda.setStatus(Status.getByName(rs.getString("STATUS_VENDA")));
		return venda;
	}
}