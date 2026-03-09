package br.com.camilaferreiranas.kenoapp.auth.domain.repository;

import br.com.camilaferreiranas.kenoapp.auth.domain.model.Address;

public interface AddressRepository {


    Address search(String cep);
}
