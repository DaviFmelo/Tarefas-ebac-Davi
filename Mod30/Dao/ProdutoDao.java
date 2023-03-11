/**
 * 
 */
package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Generics.GenericDao;
import domain.Produto;

/**
 * @author Davi
 *
 */
public class ProdutoDao  extends GenericDao<Produto, String> implements IProdutoDao {
	
	public ProdutoDao() {
		super();
	}

	public Class<Produto> getTipoClasse() {
		return Produto.class;
	}

	public void atualiarDados(Produto entity, Produto entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setDescricao(entity.getDescricao());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setValor(entity.getValor());
	}

	protected String getQueryInsercao() {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO TB_PRODUTO ");
		sb.append("(ID, CODIGO, NOME, DESCRICAO, VALOR)");
		sb.append("VALUES (nextval('sq_produto'),?,?,?,?)");
		return sb.toString();
	}

	protected void setParametrosQueryInsercao(PreparedStatement stmInsert, Produto entity) throws SQLException {
		stmInsert.setString(1, entity.getCodigo());
		stmInsert.setString(2, entity.getNome());
		stmInsert.setString(3, entity.getDescricao());
		stmInsert.setBigDecimal(4, entity.getValor());
	}

	protected String getQueryExclusao() {
		return "DELETE FROM TB_PRODUTO WHERE CODIGO = ?";
	}

	protected void setParametrosQueryExclusao(PreparedStatement stmExclusao, String valor) throws SQLException {
		stmExclusao.setString(1, valor);
	}

	protected String getQueryAtualizacao() {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_PRODUTO ");
		sb.append("SET CODIGO = ?,");
		sb.append("NOME = ?,");
		sb.append("DESCRICAO = ?,");
		sb.append("VALOR = ?");
		sb.append(" WHERE CODIGO = ?");
		return sb.toString();
	}

	protected void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Produto entity) throws SQLException {
		stmUpdate.setString(1, entity.getCodigo());
		stmUpdate.setString(2, entity.getNome());
		stmUpdate.setString(3, entity.getDescricao());
		stmUpdate.setBigDecimal(4, entity.getValor());
		stmUpdate.setString(5, entity.getCodigo());
	}

	protected void setParametrosQuerySelect(PreparedStatement stmExclusao, String valor) throws SQLException {
		stmExclusao.setString(1, valor);
	}
}