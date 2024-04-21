package com.prediosUsuarios.Controller;

import com.prediosUsuarios.Model.Familia;
import com.prediosUsuarios.Model.PredioUsuario;
import com.prediosUsuarios.Model.PredioUsuarioId;
import com.prediosUsuarios.Service.FamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/familia")
@CrossOrigin("*")
public class FamiliaController {

    @Autowired
    FamiliaService familiaService;

    @GetMapping
    public ResponseEntity<List<Familia>> getFamilia(){
        return new ResponseEntity<>(familiaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idFamiliar}")
    public ResponseEntity<Familia> getFamiliarById(@PathVariable("idFamiliar") String idFamiliar){
        return familiaService.getById(idFamiliar).map(familiar -> new ResponseEntity<>(familiar, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/cedula/{cedula}/{idPredio}")
    public ResponseEntity<List<Familia>> getFamiliarByCed(@PathVariable String cedula, @PathVariable String idPredio) {
        return new ResponseEntity<>(familiaService.getByCed(cedula, idPredio), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Familia> guardarFamiliar(@RequestBody Familia familia){
        return new ResponseEntity<>(familiaService.save(familia), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Familia> actualizarFamiliar(@RequestBody Familia familia){
        return new ResponseEntity<>(familiaService.update(familia), HttpStatus.OK);
    }

}
