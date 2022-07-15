package br.com.infocomrobson.Lavagemcarro.service.impl;

import br.com.infocomrobson.Lavagemcarro.model.Historico;
import br.com.infocomrobson.Lavagemcarro.model.HistoricoRepository;
import br.com.infocomrobson.Lavagemcarro.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistoricoServiceImpl implements HistoricoService {
    @Autowired
    private HistoricoRepository historicoRepository;

    @Override
    public Iterable<Historico> buascarTodos() {
        return historicoRepository.findAll();
    }

    @Override
    public Optional<Historico> buscarPorId(Long id) {
        return historicoRepository.findById(id);
    }

    @Override
    public void inserir(Historico historico) {
        historicoRepository.save(historico);
    }

    @Override
    public void atulizar(Long id, Historico historico) {
    }

    @Override
    public void deletar(Long id) {
        historicoRepository.deleteById(id);
    }
}
