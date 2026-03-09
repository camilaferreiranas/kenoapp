package br.com.camilaferreiranas.kenoapp.auth.domain.repository;

import br.com.camilaferreiranas.kenoapp.auth.domain.model.Password;
import br.com.camilaferreiranas.kenoapp.auth.domain.model.User;
import br.com.camilaferreiranas.kenoapp.shared.vo.Email;

public interface AuthRepository {

    User login(Email email, Password password);


}
