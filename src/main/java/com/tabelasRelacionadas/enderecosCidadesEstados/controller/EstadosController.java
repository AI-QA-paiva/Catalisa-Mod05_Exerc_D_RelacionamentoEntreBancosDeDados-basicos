package com.tabelasRelacionadas.enderecosCidadesEstados.controller;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.EstadosModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.service.EstadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadosController {
    @Autowired
    private EstadosService estadosService;

    @PostMapping(path="/estado")
    public EstadosModel cadastrarEstado(@RequestBody EstadosModel estadosModel){
        return estadosService.cadastrarEstado(estadosModel);
    }

    @GetMapping(path="/estado")
    public List<EstadosModel> buscarEstadosTotais(){
        return estadosService.buscarEstadosTodos();
    }

    @GetMapping(path="/estado/{idEstado}")
    public Optional<EstadosModel> buscarUmEstado(@PathVariable Long idEstado){
        return estadosService.buscarEstadoEspecifico(idEstado);
    }

    @PutMapping(path="/estado/{idEstado}")
    public EstadosModel alterarEstadoId(@RequestBody EstadosModel estado){
        return estadosService.alterarEstado(estado);
    }

    @DeleteMapping(path="/estado/{idEstado}")
    public void deletarUmEstado(@PathVariable Long idEstado){
        estadosService.deletarEstado(idEstado);
    }

}
