package br.com.jotalima.ballgame.model;

import br.com.jotalima.ballgame.model.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String nomeDeUsuario;

    @NonNull
    private String senha;

    private Role role;
}
