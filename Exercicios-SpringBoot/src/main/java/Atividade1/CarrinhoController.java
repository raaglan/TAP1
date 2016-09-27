package Atividade1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value ="/carrinho")
public class CarrinhoController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarProdutosNoCarrinho(){
		return "Todos os Produtos no Carrinho";
	}
	
	@RequestMapping(value="/{tamanho}", method = RequestMethod.GET)
	public String obterTamanhoDoCarrinho(@PathVariable int tamanho){
		return "Tamanho do carrinho: " + tamanho;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarCarrinho(@RequestBody Carrinho carrinho){
		try {
			System.out.println(carrinho);
			return "foi adicionado um novo carrinho " + carrinho;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String alterarCarrinho(@RequestBody Carrinho carrinho){
		try {
			System.out.println(carrinho);
			return "foi alterado o carrinho " + carrinho;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{tamanho}", method = RequestMethod.DELETE)
	public String excluirCarrinho(@PathVariable int tamanho){
		return "Carrinho: " + tamanho;
	}
}
