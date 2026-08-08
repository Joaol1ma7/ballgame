package br.com.jotalima.ballgame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="racha")
public class Racha {
    @Id
    private Long id;

    private String nome;

}