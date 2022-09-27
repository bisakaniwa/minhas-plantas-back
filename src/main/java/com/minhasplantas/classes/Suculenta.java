package com.minhasplantas.classes;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Suculenta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "ORIGEM")
    String origem;

    @Column(name = "GENERO")
    String genero;

    @Column(name = "ESPECIE")
    String especie;

    @Column(name = "ESPECIFICACAO")
    String especificacao;

    @Column(name = "NOME_POPULAR")
    String nomePopular;

    @Column(name = "IMAGENS")
    String imagens;

    @Column(name = "DETALHE")
    String detalhe;
}
