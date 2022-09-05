package com.tabelasRelacionadas.enderecosCidadesEstados.repository;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.EstadosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadosRepository extends JpaRepository<EstadosModel, Long> {
}
