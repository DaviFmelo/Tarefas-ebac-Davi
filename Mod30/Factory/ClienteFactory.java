/**
 * 
 */
package Factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Cliente;

/**
 * @author Davi
 *
 */
public class ClienteFactory {
	
	public static Cliente convert(ResultSet rs) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getLong("ID_CLIENTE"));
		cliente.setNome(rs.getString(("NOME")));
		cliente.setCpf(rs.getLong(("CPF")));
		cliente.setTelefone(rs.getLong(("TEL")));
		cliente.setEndereco(rs.getString(("ENDERECO")));
		cliente.setNumero(rs.getInt(("NUMERO")));
		cliente.setCidade(rs.getString(("CIDADE")));
		cliente.setEstado(rs.getString(("ESTADO")));
		return cliente;
	}
}