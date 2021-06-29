package br.com.Excecoes.model.exceptions;

// Exception -> Obrigado a tratar a exceção
// Runtime exception -> Não obriga a tratar
public class DomainException extends Exception {
    public DomainException(String msg) {
        super(msg);
    }
}
