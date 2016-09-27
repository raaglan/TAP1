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
@RequestMapping(value ="/usuario")
public class UsuarioController {
	
	//retorna lista de usuarios depois do barra get,
	//criando uma lista e adicionando manualmente eles nessa lista
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity< List<Usuario> > listTodosUsuarios() {
		
		//lista de usuarios informados
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(new Usuario(1,"Raphael"));
		listaUsuarios.add(new Usuario(2,"Sando"));
		listaUsuarios.add(new Usuario(3,"Chapinha"));
		
		return new ResponseEntity< List<Usuario> >(listaUsuarios, HttpStatus.OK);
	}
	@RequestMapping(value="/{identificador}", method = RequestMethod.GET)
	public String obterDadosUsuario(@PathVariable String identificador){
		return "Usuario, " + identificador;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarUsuario(@RequestBody Usuario usuario){
		try {
			System.out.println(usuario);
			return "foi adicionado o usuario " + usuario;

		} catch (Exception e) {
			return "problema";
		}
	}
	@RequestMapping(method = RequestMethod.PUT)
	public String alterarUsuario(@RequestBody Usuario usuario){
		try {
			System.out.println(usuario);
			return "foi alterado o usuario " + usuario;

		} catch (Exception e) {
			return "problema";
		}
	}
	
	@RequestMapping(value="/{identificador}", method = RequestMethod.DELETE)
	public String excluirUsuario(@PathVariable String identificador){
		return "Usuario, " + identificador;
	}
}
