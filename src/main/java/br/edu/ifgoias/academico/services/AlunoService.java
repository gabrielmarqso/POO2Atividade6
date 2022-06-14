package br.edu.ifgoias.academico.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.edu.ifgoias.academico.entities.Aluno;
import br.edu.ifgoias.academico.entities.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	private AlunoRepository alunoRep;
	
	public List<Aluno> findAll(){
		return alunoRep.findAll();
	}
	
	public Aluno findById(Integer id) {
		return alunoRep.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public Aluno insert(Aluno obj) {
		return alunoRep.save(obj);
	}
	
	public void delete(Integer id) {
		alunoRep.deleteById(id);
	}
	
	public Aluno update(Integer id, Aluno obj) {
		return alunoRep.findById(id).map(
									aluno -> {
										aluno.setNome(obj.getNome());
										aluno.setSexo(obj.getSexo());
										aluno.setDt_nasc(obj.getDt_nasc());
										aluno.setCurso(obj.getCurso());
										return alunoRep.save(aluno);
									}).orElseThrow(
										() -> new ResponseStatusException(HttpStatus.NOT_FOUND)	
									);
				
	}
	
}
