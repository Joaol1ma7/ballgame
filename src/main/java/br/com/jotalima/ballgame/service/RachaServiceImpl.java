package br.com.jotalima.ballgame.service;

import br.com.jotalima.ballgame.exception.RachaNaoEncontradoException;
import br.com.jotalima.ballgame.model.Racha;
import br.com.jotalima.ballgame.repository.RachaRepository;

public class RachaServiceImpl implements RachaService {

    private final RachaRepository rachaRepository;

    RachaServiceImpl(RachaRepository rachaRepository){
        this.rachaRepository = rachaRepository;
    }

    @Override
    public Racha createRacha(String nome) {
        Racha r= new Racha();
        r.setNome(nome);
        r=rachaRepository.save(r);
        return r;
    }

    @Override
    public Racha updateRacha(Long id, String novoNome) {
        return null;
    }

    @Override
    public Racha getRacha(Long id) {
        return rachaRepository.findById(id)
                .orElseThrow(RachaNaoEncontradoException::new);
    }

    @Override
    public void deleteRacha(Long id) {

    }
}
