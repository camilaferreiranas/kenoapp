package br.com.camilaferreiranas.kenoapp.auth.infrastructure.entities;

import br.com.camilaferreiranas.kenoapp.auth.domain.model.Address;
import br.com.camilaferreiranas.kenoapp.auth.domain.model.Password;
import br.com.camilaferreiranas.kenoapp.shared.vo.Email;
import br.com.camilaferreiranas.kenoapp.shared.vo.PersonName;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private Long id;
    private PersonName name;
    private Email email;
    private Password password;
    private Address address;



}
