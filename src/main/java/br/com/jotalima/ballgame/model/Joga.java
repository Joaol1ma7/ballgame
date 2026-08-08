package br.com.jotalima.ballgame.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="joga")
public class Joga {

    @Id
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_incidencia_de_racha",referencedColumnName = "id",nullable=false)
    private IncidenciaDeRacha incidenciaDeRacha;

    @Id
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_jogador",referencedColumnName = "id",nullable=false)
    private Usuario jogador;

    private int golsNoRacha;

    private int assistenciasNoRacha;

    private double notaProRacha;

}
