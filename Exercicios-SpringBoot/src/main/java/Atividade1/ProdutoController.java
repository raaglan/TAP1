package Atividade1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value ="/produto")
public class ProdutoController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity< List<Produto> > listTodosProdutos() {
		
		//lista de produtos informados
		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(new Produto(10.8, "Café"));
		listaProdutos.add(new Produto(5.5, "Açucar"));
		listaProdutos.add(new Produto(8.5, "Bolo"));
		
		return new ResponseEntity< List<Produto> >(listaProdutos, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{preco}", method = RequestMethod.GET)
	public String obterPrecoProduto(@PathVariable double preco){
		return "Produto, " + preco;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarProduto(@RequestBody Produto produto){
		try {
			System.out.println(produto);
			return "foi adicionado o produto " + produto;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String alterarProduto(@RequestBody Produto produto){
		try {
			System.out.println(produto);
			return "foi alterado o produto " + produto;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{preco}", method = RequestMethod.DELETE)
	public String excluirUsuario(@PathVariable double preco){
		return "Produto, " + preco;
	}
}
