package com.tabelasRelacionadas.enderecosCidadesEstados.repository;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.CidadesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadesRepository extends JpaRepository<CidadesModel, Long> {
}
