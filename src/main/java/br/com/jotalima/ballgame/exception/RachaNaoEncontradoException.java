package br.com.jotalima.ballgame.exception;

public class RachaNaoEncontradoException extends RuntimeException {
    public RachaNaoEncontradoException() {
        super("O racha não foi encontrado.");
    }
}
