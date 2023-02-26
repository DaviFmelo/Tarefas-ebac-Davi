package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Generics.GenericDao;
import domain.Cliente;
/**
 * @author Davi
 *
 */
public class ClienteDao extends GenericDao<Cliente, Long> implements IClienteDao {

	public ClienteDao() {
		super();
	}

	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEndereco(entity.getEndereco());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTelefone(entity.getTelefone());
		
	}

	protected String getQueryInsercao() {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO TB_CLIENTE ");
		sb.append("(ID, NOME, CPF, TEL, ENDERECO, NUMERO, CIDADE, ESTADO)");
		sb.append("VALUES (nextval('sq_cliente'),?,?,?,?,?,?,?)");
		return sb.toString();
	}

	protected void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException {
		stmInsert.setString(1, entity.getNome());
		stmInsert.setLong(2, entity.getCpf());
		stmInsert.setLong(3, entity.getTelefone());
		stmInsert.setString(4, entity.getEndereco());
		stmInsert.setLong(5, entity.getNumero());
		stmInsert.setString(6, entity.getCidade());
		stmInsert.setString(7, entity.getEstado());
		
	}

	protected String getQueryExclusao() {
		return "DELETE FROM TB_CLIENTE WHERE CPF = ?";
	}

	protected void setParametrosQueryExclusao(PreparedStatement stmExclusao, Long valor) throws SQLException {
		stmExclusao.setLong(1, valor);
	}
	
	protected String getQueryAtualizacao() {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_CLIENTE ");
		sb.append("SET NOME = ?,");
		sb.append("TEL = ?,");
		sb.append("ENDERECO = ?,");
		sb.append("NUMERO = ?,");
		sb.append("CIDADE = ?,");
		sb.append("ESTADO = ?");
		sb.append(" WHERE CPF = ?");
		return sb.toString();
	}

	protected void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException {
		stmUpdate.setString(1, entity.getNome());
		stmUpdate.setLong(2, entity.getTelefone());
		stmUpdate.setString(3, entity.getEndereco());
		stmUpdate.setLong(4, entity.getNumero());
		stmUpdate.setString(5, entity.getCidade());
		stmUpdate.setString(6, entity.getEstado());
		stmUpdate.setLong(7, entity.getCpf());
	}

	protected void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException {
		stmSelect.setLong(1, valor);
	}

}
