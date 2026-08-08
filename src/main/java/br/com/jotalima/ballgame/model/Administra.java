package br.com.jotalima.ballgame.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="administra")
public class Administra {

    @Id
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_racha",referencedColumnName = "id",nullable=false)
    private Racha racha;

    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_admin",referencedColumnName = "id",nullable=false)
    private Usuario admin;
}
