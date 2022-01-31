package exercicio.carol.br;



import static org.junit.Assert.assertTrue;
import java.util.Collection;


import org.junit.Test;

public class SistemaComercialMapTest {
	@Test
	public void testaCadastroProdutos() {
		SistemaComercialMap sistema = new SistemaComercialMap();
		Collection<Produto> alimentos =
				sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
		assertTrue(alimentos.size()==0);
		String o = "ARROZ";
		sistema.cadastraProduto(new Produto(o, " ", 0, 0, CategoriaProduto.ALIMENTO ));
				Collection<Produto> produtoAlimento =
				sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
				assertTrue(produtoAlimento.size()==1);
				assertTrue(produtoAlimento.equals(o));
				}		
}