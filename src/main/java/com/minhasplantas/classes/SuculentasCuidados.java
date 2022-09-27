package com.minhasplantas.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SuculentasCuidados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "SUCULENTA_ID")
    Long suculenta_id;

    @Column(name = "SUBSTRATO")
    String substrato;

    @Column(name = "REGA")
    String rega;

    @Column(name = "ILUMINACAO")
    String iluminacao;

    @Column(name = "TEMPERATURA")
    String temperatura;

    @Column(name = "UMIDADE")
    String umidade;

    @Column(name = "VENTOS")
    String ventos;

    @Column(name = "EXTRA")
    String extra;

}
