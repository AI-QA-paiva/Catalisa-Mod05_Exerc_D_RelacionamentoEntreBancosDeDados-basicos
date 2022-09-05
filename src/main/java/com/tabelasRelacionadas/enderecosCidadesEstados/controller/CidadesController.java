package com.tabelasRelacionadas.enderecosCidadesEstados.controller;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.CidadesModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.service.CidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadesController {
    @Autowired
    private CidadesService cidadesService;

    @PostMapping(path="/cidade")
    public CidadesModel cadastrarNvCidade(@RequestBody CidadesModel cidadesModel){
        return cidadesService.cadastrarCidade(cidadesModel);
    }

    @GetMapping(path="/cidade")
    public List<CidadesModel> buscarCidadesGeral(){
        return cidadesService.buscarCidadesTotais();
    }

    @GetMapping(path="/cidade/{idCidade}")
    public Optional<CidadesModel> buscarUmacidade(@PathVariable Long idCidade){
        return cidadesService.buscarCidadeEspecifica(idCidade);
    }

    @PutMapping(path="/cidade/{idCidade}")
    public CidadesModel alterarCidade(@RequestBody CidadesModel cidadesModel){
        return cidadesService.alterarCidade(cidadesModel);
    }

    @DeleteMapping(path="/cidade/{idCidade}")
    public void deletarCidade(@PathVariable Long idCid){
        cidadesService.deletarCidade(idCid);
    }
}
