/**
 * 
 */
package davi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import davi.dao.jdbc.Factory;
import davi.domain.Produto;

/**
 * @author Davi
 *
 */
public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Integer cadastrarProduto(Produto produto) throws Exception {
		
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "INSERT INTO TB_PRODUTO (ID, NOME_PRODUTO, PRECO, PARCELAMENTO) VALUES (?,?,?,?)";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, produto.getId());
			stm.setString(2, produto.getNome_Produto());
			stm.setInt(3, produto.getPreco());
			stm.setString(4, produto.getParcelamento());
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
	public Produto consultarProduto(Long id) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Produto produto = null;
		try {
			connection = Factory.getConnection();
			String sql = "select * from tb_produto where id = ?";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, id);
			rs = stm.executeQuery();
			if (rs.next()) {
				produto = new Produto();
				produto.setId(rs.getLong("id"));
				produto.setNome_Produto("Arroz");
				produto.setParcelamento("parcelamento");
				produto.setPreco(rs.getInt("preco"));
			}
			return produto;
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
	public Integer excluir(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "DELETE FROM TB_PRODUTO WHERE ID = ?";
			stm = connection.prepareStatement(sql);
			stm.setLong(1, produto.getId());
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
	public Integer alterarProduto(Produto produtoBD) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "ALTER TABLE TB_PRODUTO DROP COLUMN NOME_PRODUTO";
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
	public List<Produto> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = Factory.getConnection();
			String sql = "SELECT * FROM TB_PRODUTO";
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
