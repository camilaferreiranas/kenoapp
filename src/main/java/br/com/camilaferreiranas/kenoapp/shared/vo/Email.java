package br.com.camilaferreiranas.kenoapp.shared.vo;

public class Email {

    private String value;

    public Email(String value) {
        if(!value.contains("@")) throw new RuntimeException("Invaliid mail");
        this.value = value;
    }
}
