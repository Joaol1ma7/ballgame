package br.com.jotalima.ballgame.controller;

import br.com.jotalima.ballgame.exception.RachaJaExisteException;
import br.com.jotalima.ballgame.exception.RachaNaoEncontradoException;
import br.com.jotalima.ballgame.model.Racha;
import br.com.jotalima.ballgame.service.RachaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/racha")
public class RachaController {

    private final RachaService rachaService;
    RachaController(RachaService rachaService){
        this.rachaService = rachaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Racha> getById(@PathVariable Long id) {
        try{
            Racha racha = rachaService.getById(id);
            return ResponseEntity.ok(racha);
        }catch(RachaNaoEncontradoException r){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Racha> createRacha(@RequestBody String nome) {
        try{
            Racha racha = rachaService.createRacha(nome);
            return ResponseEntity.created(null).body(racha);
        }catch(RachaJaExisteException r){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PutMapping
    public ResponseEntity<Racha> updateRacha(@PathVariable Long id, @RequestBody String nome){
        try{
            Racha racha= rachaService.updateRacha(id,nome);
            return ResponseEntity.ok().body(racha);
        }catch(RachaNaoEncontradoException e){
            return ResponseEntity.notFound().build();
        }catch(RachaJaExisteException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteRacha(@PathVariable Long id){
        try{
            rachaService.deleteRacha(id);
            return ResponseEntity.noContent().build();
        }catch(RachaNaoEncontradoException e){
            return ResponseEntity.notFound().build();
        }
    }
}
