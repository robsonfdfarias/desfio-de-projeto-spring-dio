package br.com.infocomrobson.Lavagemcarro.service;

import br.com.infocomrobson.Lavagemcarro.model.Historico;

import java.util.Optional;


public interface HistoricoService {
    Iterable<Historico> buascarTodos();
    Optional<Historico> buscarPorId(Long id);
    void inserir(Historico historico);
    void atulizar(Long id, Historico historico);
    void deletar(Long id);
}
