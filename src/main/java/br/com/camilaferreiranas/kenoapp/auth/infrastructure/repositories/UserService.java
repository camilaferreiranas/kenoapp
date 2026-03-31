package br.com.camilaferreiranas.kenoapp.auth.infrastructure.repositories;

import br.com.camilaferreiranas.kenoapp.auth.domain.model.Password;
import br.com.camilaferreiranas.kenoapp.auth.domain.model.User;
import br.com.camilaferreiranas.kenoapp.auth.domain.repository.UserRepository;
import br.com.camilaferreiranas.kenoapp.auth.infrastructure.entities.UserEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserRepository {

    private final UserRepositoryJpa userRepositoryJpa;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepositoryJpa userRepositoryJpa, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepositoryJpa = userRepositoryJpa;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User create(User user) {

        var entityToSave = userRepositoryJpa.save(toEntity(user));
        return new User(entityToSave.getId(), entityToSave.getName(),
                entityToSave.getEmail(), entityToSave.getPassword(), entityToSave.getAddress()) ;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }


    //TODO: mudar
    private UserEntity toEntity(User user) {
        var password = fillPass(user.getPassword().getValue());
        UserEntity userEntity = new UserEntity();
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setAddress(user.getAddress());
        userEntity.setPassword(password);
        return userEntity;
    }


    private Password fillPass(String value) {
        String pass = bCryptPasswordEncoder.encode(value);
        Password password = new Password();
        password.setValue(pass);
        return password;
    }

}
