package br.com.infocomrobson.Lavagemcarro.controller;

import br.com.infocomrobson.Lavagemcarro.model.Historico;
import br.com.infocomrobson.Lavagemcarro.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("historico")
public class AppTestController {
    @Autowired
    private HistoricoService historicoService;

    @GetMapping
    public ResponseEntity<Iterable<Historico>> buscarTodos(){
        return ResponseEntity.ok(historicoService.buascarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Historico>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(historicoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Historico> inserir(@RequestBody Historico historico){
        historicoService.inserir(historico);
        return ResponseEntity.ok(historico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Historico> atualizar(@PathVariable Long id, @RequestBody Historico historico){
        historicoService.atulizar(id, historico);
        return ResponseEntity.ok(historico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Historico> deletar(@PathVariable Long id){
        historicoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
