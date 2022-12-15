/**
 * 
 */
package davi.domain;

/**
 * @author Davi
 *
 */
public class Produto {
	
	private String nome_Produto;
	
	private Long id;
	
	private Integer preco;
	
	private String parcelamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public String getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(String parcelamento) {
		this.parcelamento = parcelamento;
	}

	public String getNome_Produto() {
		return nome_Produto;
	}

	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
}
