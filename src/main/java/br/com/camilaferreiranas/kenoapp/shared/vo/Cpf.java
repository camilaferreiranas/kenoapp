package br.com.camilaferreiranas.kenoapp.shared.vo;

import br.com.camilaferreiranas.kenoapp.shared.exception.InvalidValueException;

public class Cpf {

    private String value;


    public Cpf(String value) {
        if (value.length() > 11 && value.isBlank()) throw new InvalidValueException("Invalid value of cpf");
        this.value = value;
    }
}
