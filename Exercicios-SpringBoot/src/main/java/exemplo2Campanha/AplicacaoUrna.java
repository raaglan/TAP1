package exemplo2Campanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@RequestMapping(value="/teste")
public class AplicacaoUrna extends SpringBootServletInitializer{

	public static void main(String args[]){
		SpringApplication.run(AplicacaoUrna.class, args);
	}
}