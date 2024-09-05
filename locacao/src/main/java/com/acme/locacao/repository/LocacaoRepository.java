package com.acme.locacao.repository;

import com.acme.locacao.model.Locacao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocacaoRepository extends MongoRepository<Locacao, String> {
}
