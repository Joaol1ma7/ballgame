package br.com.jotalima.ballgame.service;

import br.com.jotalima.ballgame.exception.RachaJaExisteException;
import br.com.jotalima.ballgame.exception.RachaNaoEncontradoException;
import br.com.jotalima.ballgame.model.Racha;
import br.com.jotalima.ballgame.repository.RachaRepository;
import org.springframework.stereotype.Service;

@Service
public class RachaService{

    private final RachaRepository rachaRepository;

    RachaService(RachaRepository rachaRepository){
        this.rachaRepository = rachaRepository;
    }

    public Racha createRacha(String nome) {
        Racha r= rachaRepository.findByNome(nome).orElse(null);
        if (r!=null){
            throw new RachaJaExisteException();
        }

        Racha rCriado= new Racha();
        rCriado.setNome(nome);
        rCriado=rachaRepository.save(rCriado);
        return rCriado;
    }

    public Racha updateRacha(Long id, String novoNome){
        Racha t= rachaRepository.findByNome(novoNome).orElse(null);
        if (t!=null){
            throw new RachaJaExisteException();
        }
        Racha r= rachaRepository.findById(id).orElseThrow(RachaNaoEncontradoException::new);
        r.setNome(novoNome);
        r=rachaRepository.save(r);
        return r;

    }

    public Racha getById(Long id) {
        return rachaRepository.findById(id)
                .orElseThrow(RachaNaoEncontradoException::new);
    }


    //public Racha getAllRachaByUsuario(Long usuarioId){
       // Usuario user= usuarioService.getUsuarioById(usuarioId).orElseThrow(UsuarioNaoEncontradoException::new);
    //}

    public void deleteRacha(Long id) {
        Racha r= rachaRepository.findById(id).orElseThrow(RachaNaoEncontradoException::new);
        rachaRepository.delete(r);
    }
}
