/**
 * 
 */
package davi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import davi.dao.jdbc.Factory;
import davi.domain.Cliente;

/**
 * @author Davi
 *
 */
public class ClienteDAO implements IClienteDAO {

	@Override
	public Integer cadastrar(Cliente cliente) throws Exception {
		
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "INSERT INTO TB_CLIENTE(ID, NOME, IDADE, CPF, SEXO) VALUES(?,?,?,?,?)";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, cliente.getId());
			stm.setString(2, cliente.getNome());
			stm.setInt(3, cliente.getIdade());
			stm.setInt(4, cliente.getCpf());
			stm.setString(5, cliente.getSexo());
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Cliente consultar(Long id) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Cliente cliente1 = null;
		try {
			connection = Factory.getConnection();
			String sql = "select * from tb_cliente where id = ?";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, id);
			rs = stm.executeQuery();
			if (rs.next()) {
				cliente1 = new Cliente();
				cliente1.setId(rs.getLong("id"));
				cliente1.setNome("João");
				cliente1.setIdade(rs.getInt("idade"));
				cliente1.setSexo("Sexo");
				cliente1.setCpf(rs.getInt("cpf"));
			}
			return cliente1;
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Integer excluir(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "DELETE FROM TB_CLIENTE WHERE ID = ?";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, cliente.getId());
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Integer alterar(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "ALTER TABLE TB_CLIENTE DROP COLUMN NOME";
			stm = connection.prepareStatement(sql);
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public List<Cliente> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "SELECT * FROM TB_CLIENTE";
			stm = connection.prepareStatement(sql);
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return null;
	}
}

