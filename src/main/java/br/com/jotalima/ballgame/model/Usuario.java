package br.com.jotalima.ballgame.model;

import br.com.jotalima.ballgame.model.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="usuario")
public class Usuario {
    @Id
    private Long id;

    private String nome;

    private String nomeDeUsuario;

    @NonNull
    private String senha;

    private Role role;
}
