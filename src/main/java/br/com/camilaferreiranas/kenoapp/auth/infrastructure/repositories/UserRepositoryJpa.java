package br.com.camilaferreiranas.kenoapp.auth.infrastructure.repositories;

import br.com.camilaferreiranas.kenoapp.auth.infrastructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJpa extends JpaRepository<UserEntity, Long> {
}
