package com.example.CheckMutant.controller;

import com.example.CheckMutant.ADNRequest;
import com.example.CheckMutant.service.ADNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adn")
public class ADNController {

@Autowired
    private ADNService adnService;


@PostMapping("/mutant")
    public ResponseEntity<Void> isMutant(@RequestBody ADNRequest dnaRequest) {
    String[] dna = dnaRequest.getDna();

    if (adnService.isMutant(dna)) {

        return ResponseEntity.ok().build(); //Retorna 200 OK si es mutante
    } else {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build(); //Retorna 403 si no es mutante
    }

}

}
