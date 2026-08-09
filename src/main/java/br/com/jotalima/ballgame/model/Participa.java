package br.com.jotalima.ballgame.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="participa")
public class Participa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_racha",referencedColumnName = "id",nullable=false)
    private Racha racha;

    @ManyToOne
    @JoinColumn(name="id_jogador",referencedColumnName = "id",nullable=false)
    private Usuario jogador;

    private int golsTotais;
    private int astTotais;
    private double notaGeral;
}
