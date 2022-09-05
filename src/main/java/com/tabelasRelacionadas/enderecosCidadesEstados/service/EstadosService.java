package com.tabelasRelacionadas.enderecosCidadesEstados.service;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.EstadosModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.repository.EstadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadosService {
    @Autowired
    private EstadosRepository estadosRepository;

    public EstadosModel cadastrarEstado(EstadosModel estado){
        return estadosRepository.save(estado);
    }

    public List<EstadosModel> buscarEstadosTodos(){
        return estadosRepository.findAll();
    }

    public Optional<EstadosModel> buscarEstadoEspecifico(Long idEstado){
        return estadosRepository.findById(idEstado);
    }

    public EstadosModel alterarEstado(EstadosModel estado){
        return estadosRepository.save(estado);
    }

    public void deletarEstado(Long idEstado){estadosRepository.deleteById(idEstado);
    }

}
