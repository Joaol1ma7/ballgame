package br.com.jotalima.ballgame.repository;

import br.com.jotalima.ballgame.model.Racha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RachaRepository extends JpaRepository<Racha,Long>{
    Optional<Racha> findByNome(String nome);
}
