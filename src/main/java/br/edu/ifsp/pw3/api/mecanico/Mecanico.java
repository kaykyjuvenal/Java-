package br.edu.ifsp.pw3.api.mecanico;

import jakarta.persistence.*;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico{

    private String nome;
    private String anos_experiencia;

    public Mecanico(DadosMecanico dados) {
        this.nome = dados.nome();
        this.anos_experiencia = dados.anos_experiencia();
    }

}
