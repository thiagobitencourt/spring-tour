package io.codetour.domain.aluno;

import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	public Aluno findByNome(String nome);
}
