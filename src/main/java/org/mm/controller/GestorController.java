package org.mm.controller;

import org.mm.entities.Gestor;
import org.mm.services.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gestor")
public class GestorController {

    @Autowired
    private GestorService gestorService;

    @PostMapping("/salvar")
    public ResponseEntity salvarAlunos(@RequestBody Gestor gestor){
        gestorService.salvarGestor(gestor);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
