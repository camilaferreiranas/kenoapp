package br.com.camilaferreiranas.kenoapp.shared.vo;

public class PersonName {

    private String value;

    public PersonName(String value) {
        if(value.isEmpty()) throw new RuntimeException("Value is not valid");
        if(value.length() < 3) throw new RuntimeException("Add a complete name");
        this.value = value;
    }


}
