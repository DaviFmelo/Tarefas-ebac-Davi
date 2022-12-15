/**
 * 
 */
package davi.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import davi.dao.IProdutoDAO;
import davi.dao.ProdutoDAO;
import davi.domain.Produto;

/**
 * @author Davi
 *
 */
public class ProdutoTest {
	
	@Test
	 public void cadastrarProdutoTest() throws Exception {
		
		//Cadastrar Produto
		
		IProdutoDAO dao = new ProdutoDAO();	
		
		Produto produto = new Produto ();
		produto.setId(9l);
		produto.setNome_Produto("Arroz");
		produto.setParcelamento("2x sem juros");
		produto.setPreco(30);
		
		Integer qtd = dao.cadastrarProduto(produto);
		assertTrue(qtd == 1);
		
		//Consultar Produto
		
		Produto produtoBD = dao.consultarProduto(produto.getId());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getId(), produtoBD.getId());
		assertEquals(produto.getNome_Produto(), produtoBD.getNome_Produto());
		
		//Alterar Produto
		
		@SuppressWarnings("unused")
		Integer alterarProduto = dao.alterarProduto(produtoBD);
		
		//Buscar Todos os Produtos
		
		@SuppressWarnings("unused")
		List <Produto> buscarTodos = dao.buscarTodos();
		
		//Excluir Produto
		
		Integer qtdDel = dao.excluir(produtoBD);
		assertNotNull(qtdDel);
	}
}

