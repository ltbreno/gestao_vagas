package br.com.brenolopes.vagas_clientes.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("Usuario já existe");
    }
}
