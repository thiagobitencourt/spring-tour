package io.codetour.domain.historico;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import io.codetour.domain.curso.Disciplina;

public interface HistoricoRepository extends CrudRepository<Historico, Long>{
	
	public Collection<Historico>findByDisciplinaInAndAprovadoTrue(Collection<Disciplina> disciplinas);

}
