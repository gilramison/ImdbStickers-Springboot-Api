package com.example.linguagens.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
  
   //conectando ao MongoDB
    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }
    @GetMapping("/")
    public List<Linguagem> obterLinguagens2() {        
        List<Linguagem> linguagens = new ArrayList<>();// = repositorio.findAll();

        if (linguagens.isEmpty()){
            Linguagem linguagemTemp = new Linguagem();
            linguagemTemp.setId("vazio");
            linguagemTemp.setImage("vazio");
            linguagemTemp.setRanking(0);
            linguagemTemp.setTitle("vazio");
            linguagens.add(linguagemTemp) ;        
        }
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){

      Linguagem linguagemSalva = repositorio.save(linguagem);
      return linguagemSalva;  
    }

}
