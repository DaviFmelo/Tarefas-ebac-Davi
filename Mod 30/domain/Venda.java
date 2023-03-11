/**
 * 
 */
package domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import Annotation.Chave;
import Annotation.ColunaTabela;
import Annotation.Tabela;
import Dao.Persistente;

/**
 * @author Davi
 *
 */
@Tabela("TB_VENDA")
public class Venda implements Persistente {
	
	public enum Status {
		INICIADA, CONCLUIDA, CANCELADA;
		
		public static Status getByName(String value) {
			for (Status status : Status.values()) {
				if (status.name().equals(value)) {
					return status;
				}
			}
			return null;
		}
	}
	
	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private Long id;
	
	@Chave("getCodigo")
	@ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
	private String codigo;
	
	@ColunaTabela(dbName = "id_cliente_fk", setJavaName = "setIdClienteFk")
	private Cliente cliente;
	
	private Set<ProdutoQuantidade> produtos;
	
	@ColunaTabela(dbName = "valor_total", setJavaName = "setValorTotal")
	private BigDecimal valorTtotal;
	
	@ColunaTabela(dbName = "data_Venda", setJavaName = "setDataVenda")
	private long dataVenda;
	
	@ColunaTabela(dbName = "status_venda", setJavaName = "setStatus")
	private Status status;
	
	public Venda(){
		produtos = new HashSet <>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<ProdutoQuantidade> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<ProdutoQuantidade> produtos) {
		this.produtos = produtos;
	}

	public BigDecimal getValorTtotal() {
		return valorTtotal;
	}

	public void setValorTtotal(BigDecimal valorTtotal) {
		this.valorTtotal = valorTtotal;
	}

	public long getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(long dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void recalcularValorTotalVenda() {
		// TODO Auto-generated method stub
		
	}

	public void adicionarProduto(Produto produto, int i) {
		// TODO Auto-generated method stub
		
	}

	public int getQuantidadeTotalProdutos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void removerProduto(Produto prod, int i) {
		// TODO Auto-generated method stub
		
	}

	public void removerTodosProdutos() {
		// TODO Auto-generated method stub
		
	}

	public double getTotal_venda() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDataVenda(Instant now) {
		// TODO Auto-generated method stub
		
	}
}
