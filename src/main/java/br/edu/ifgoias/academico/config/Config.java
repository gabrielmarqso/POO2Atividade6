package br.edu.ifgoias.academico.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.academico.entities.Curso;
import br.edu.ifgoias.academico.entities.repositories.CursoRepository;

@Configuration
public class Config implements CommandLineRunner {

	//@Autowired
	//private CursoRepository cursoRep;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Curso c1 = new Curso(null,"POO II");
		
		//Curso c2 = new Curso(null,"EAD II");
		
		//cursoRep.save(c1);
		
		//cursoRep.save(c2);
		
		//cursoRep.delete(c1);
		
		//System.out.println("Qtde Cursos: " + cursoRep.count()) ;
	}

}
