package com.tabelasRelacionadas.enderecosCidadesEstados.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name="estado")

public class EstadosModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;

    @Column(name="nome_estado",nullable = false)
    private String nomeEstado;

    @Column(name="uf",nullable = false)
    private String siglaEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estadosModel",cascade = CascadeType.ALL)
    private List<CidadesModel> cidades;

}
