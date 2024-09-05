package com.acme.locacao.service;

import com.acme.locacao.model.Locacao;
import com.acme.locacao.repository.LocacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocacaoService {
    public final LocacaoRepository locacaoRepository;

    public Locacao save(Locacao locacao) {
        return locacaoRepository.save(locacao);
    }
}
