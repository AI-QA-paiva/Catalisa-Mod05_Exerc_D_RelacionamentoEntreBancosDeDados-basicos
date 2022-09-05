package com.tabelasRelacionadas.enderecosCidadesEstados.service;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.CidadesModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.repository.CidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadesService {
    @Autowired
    private CidadesRepository cidadesRepository;

    public CidadesModel cadastrarCidade(CidadesModel cidade){
        return cidadesRepository.save(cidade);
    }

    public List<CidadesModel> buscarCidadesTotais(){
        return cidadesRepository.findAll();
    }

    public Optional<CidadesModel> buscarCidadeEspecifica(Long idC){
        return cidadesRepository.findById(idC);
    }

    public CidadesModel alterarCidade(CidadesModel cidade){
        return cidadesRepository.save(cidade);
    }

    public void deletarCidade(Long idCidade){
        cidadesRepository.deleteById(idCidade);
    }
}
