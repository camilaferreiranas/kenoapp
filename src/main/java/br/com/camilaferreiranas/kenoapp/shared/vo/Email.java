package br.com.camilaferreiranas.kenoapp.shared.vo;

import br.com.camilaferreiranas.kenoapp.shared.exception.InvalidValueException;

public class Email {

    private String value;

    public Email(String value) {
        if(!value.contains("@") ||
                value.matches("/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$/\n"))
            throw new InvalidValueException("Invalid mail");
        this.value = value;
    }
}
