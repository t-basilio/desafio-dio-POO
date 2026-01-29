package br.com.dio.exception;

public class ConteudoNotFoundException extends RuntimeException{

    public ConteudoNotFoundException(String message) {
        super(message);
    }
}
