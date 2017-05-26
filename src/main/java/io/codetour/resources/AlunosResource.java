package io.codetour.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.codetour.domain.aluno.Aluno;
import io.codetour.domain.aluno.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunosResource {

	private AlunoRepository alunoRepository;
	
	public AlunosResource(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	@GetMapping
	public Iterable<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Aluno getById(@PathVariable Long id) {
		return alunoRepository.findOne(id);
	}
	
	@GetMapping(value="/nome/{nome}")
	public Aluno getByNome(@PathVariable String nome) {
		return alunoRepository.findByNome(nome);
	}
	
	@PostMapping
	public Aluno saveAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@PutMapping(value="/{id}")
	public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping(value="/{id}")
	public void removeAluno(@PathVariable Long id) {
		alunoRepository.delete(id);
	}
	
}
