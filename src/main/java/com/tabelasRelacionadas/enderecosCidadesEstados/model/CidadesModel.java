package com.tabelasRelacionadas.enderecosCidadesEstados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name="cidade")

public class CidadesModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCidade;

    @Column(name="nome_cidade",nullable = false)
    private String nomeCidade;

    @ManyToOne// A classe dominante é Cidade
    @JoinColumn(name="cidade_idCidade")//,referencedColumnName = ""
    private EstadosModel estadosModel;

}
