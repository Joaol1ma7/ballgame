package br.com.jotalima.ballgame.service;

import br.com.jotalima.ballgame.model.Racha;

import java.util.List;

public interface RachaService {

    Racha createRacha(String nome);

    Racha updateRacha(Long id,String novoNome);

    Racha getRacha(Long id);

    void deleteRacha(Long id);
}
