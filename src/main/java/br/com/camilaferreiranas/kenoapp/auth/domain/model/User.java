package br.com.camilaferreiranas.kenoapp.auth.domain.model;

import br.com.camilaferreiranas.kenoapp.shared.vo.Email;
import br.com.camilaferreiranas.kenoapp.shared.vo.PersonName;

public class User {

    private Long id;
    private PersonName name;
    private Email email;
    private Password password;
}
