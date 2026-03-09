package br.com.camilaferreiranas.kenoapp.auth.domain.model;

public class Address {

    private String cep;
    private String street;
    private Integer number;
    private String city;
    private String uf;

    public Address() {
    }

    public Address(String cep, String street, Integer number, String city, String uf) {
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.city = city;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
