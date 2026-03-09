package br.com.camilaferreiranas.kenoapp.shared.vo;

import br.com.camilaferreiranas.kenoapp.shared.exception.InvalidValueException;

public class PersonName {

    private String value;

    public PersonName(String value) {
        if(value.isBlank()) throw new InvalidValueException("Value is not valid");
        if(value.length() < 3) throw new InvalidValueException("Add a complete name");
        this.value = value;
    }


}
