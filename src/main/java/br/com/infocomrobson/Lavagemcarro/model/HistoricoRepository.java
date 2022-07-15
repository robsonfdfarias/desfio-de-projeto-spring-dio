package br.com.infocomrobson.Lavagemcarro.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoRepository extends CrudRepository<Historico, Long> {
}
