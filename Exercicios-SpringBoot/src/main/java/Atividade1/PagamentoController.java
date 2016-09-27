package Atividade1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PagamentoController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarProdutosPagos(){
		return "Todos os Produtos Pagos";
	}
	
	@RequestMapping(value="/{valor}", method = RequestMethod.GET)
	public String obterValorDosProdutos(@PathVariable double valor){
		return "Valor da compra " + valor;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarPagamento(@RequestBody Pagamento pagamento){
		try {
			System.out.println(pagamento);
			return "foi adicionado um novo pagamento " + pagamento;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String alterarCarrinho(@RequestBody Pagamento pagamento){
		try {
			System.out.println(pagamento);
			return "foi alterado o pagamento " + pagamento;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{valor}", method = RequestMethod.DELETE)
	public String excluirCarrinho(@PathVariable double valor){
		return "Pagamento: " + valor;
	}
}
