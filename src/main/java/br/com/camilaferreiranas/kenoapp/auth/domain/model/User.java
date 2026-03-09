package br.com.camilaferreiranas.kenoapp.auth.domain.model;

import br.com.camilaferreiranas.kenoapp.shared.vo.Email;
import br.com.camilaferreiranas.kenoapp.shared.vo.PersonName;

public class User {

    private Long id;
    private PersonName name;
    private Email email;
    private Password password;
    private Address address;

    public User() {
    }

    public User(Long id, PersonName name, Email email, Password password, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
