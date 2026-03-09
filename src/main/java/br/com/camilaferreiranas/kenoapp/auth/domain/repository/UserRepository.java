package br.com.camilaferreiranas.kenoapp.auth.domain.repository;

import br.com.camilaferreiranas.kenoapp.auth.domain.model.User;

public interface UserRepository {

    User create(User user);

    void delete(Long id);
    User update(User user);
}
