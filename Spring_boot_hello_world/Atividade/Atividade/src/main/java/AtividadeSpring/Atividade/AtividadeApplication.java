package AtividadeSpring.Atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController



public class AtividadeApplication {
	
	@GetMapping("/rote1")
	public String atividade1() {
		return "Orientação ao detalhe, percistencia e trabalho em equipe";
	}
	
	@GetMapping("/rote2")
	public String atividade2() {
		return "Aprender spring e ler Design Pattern";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

}
