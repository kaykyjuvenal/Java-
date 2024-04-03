package br.edu.ifsp.pw3.api.controller;

import br.edu.ifsp.pw3.api.conserto.Conserto;
import br.edu.ifsp.pw3.api.conserto.ConsertoRepository;
import br.edu.ifsp.pw3.api.conserto.DadosCadastroConserto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroConserto dados){
        System.out.println(dados);
        repository.save( new Conserto(dados));

    }

}
