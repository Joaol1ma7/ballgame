package br.com.jotalima.ballgame.exception;

public class RachaJaExisteException extends RuntimeException {
    public RachaJaExisteException() {
        super("Um racha com esse nome já existe.");
    }
}
