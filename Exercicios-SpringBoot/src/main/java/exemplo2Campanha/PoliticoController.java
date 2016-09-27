package exemplo2Campanha;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/politico")
public class PoliticoController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarPoliticos(){
		return "Todos os Politicos";
	}
	
	@RequestMapping(value="/{identificador}", method = RequestMethod.GET)
	public String obterNumeroPolitico(@PathVariable(value="identificador")int id){
		return "Politico, " + id;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarPolitico(@RequestBody Politico politico){
		try {
			System.out.println(politico);
			return "foi adicionado o politico " + politico;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String alterarPolitico(@RequestBody Politico politico){
		try {
			System.out.println(politico);
			return "foi alterado o politico " + politico;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.DELETE)
	public String excluirPolitico(@PathVariable String identificador){
		return "Politico, " + identificador;
	}
}
