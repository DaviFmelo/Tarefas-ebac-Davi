package domain;

import Annotation.Chave;
import Annotation.ColunaTabela;
import Annotation.Tabela;
import Dao.Persistente;

/**
 * @author Davi
 *
 */
@Tabela("TB_CLIENTE")
public class Cliente implements Persistente {
	
	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private long id;
	
	@ColunaTabela(dbName = "nome", setJavaName = "setNome")
	private String nome;
	
	@Chave("getCpf")
	@ColunaTabela(dbName = "cpf", setJavaName = "setCpf")
	private long cpf;
	
	@ColunaTabela(dbName = "telefone", setJavaName = "setTelefone")
	private long telefone;
	
	@ColunaTabela(dbName = "endereco", setJavaName = "setEndereco")
	private String endereco;
	
	@ColunaTabela(dbName = "numero", setJavaName = "setNumero")
	private Integer numero;
	
	@ColunaTabela(dbName = "cidade", setJavaName = "setCidade")
	private String cidade;
	
	@ColunaTabela(dbName = "estado", setJavaName = "setEstado")
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}
	

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}