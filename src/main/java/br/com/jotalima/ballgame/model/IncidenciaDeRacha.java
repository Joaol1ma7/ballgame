package br.com.jotalima.ballgame.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="incidencia_de_racha")
public class IncidenciaDeRacha {
    @Id
    private Long id;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_racha",referencedColumnName = "id",nullable=false)
    private Racha racha;

    private LocalDateTime dataHoraDeInicio;

    private LocalDateTime dataHoraDeFim;
}
