package com.prediosUsuarios.Controller;

import com.prediosUsuarios.Model.PredioUsuario;
import com.prediosUsuarios.Model.PredioUsuarioId;
import com.prediosUsuarios.Service.PredioUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prediousuario")
@CrossOrigin("*")
public class PredioUsuarioController {

    @Autowired
    PredioUsuarioService predioUsuarioService;

    @GetMapping
    public ResponseEntity<List<PredioUsuario>> getPrediosUsuario(){
        return new ResponseEntity<>(predioUsuarioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idPredio}/{cedula}")
    public ResponseEntity<PredioUsuario> obtenerPredioUsuarioPorId(
            @PathVariable String idPredio,
            @PathVariable String cedula) {

        PredioUsuarioId predioUsuarioId = new PredioUsuarioId(idPredio, cedula);
        return predioUsuarioService.getById(predioUsuarioId).map(predioUsuario -> new ResponseEntity<>(predioUsuario, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<PredioUsuario> guardarPredioUsuario(@RequestBody PredioUsuario predioUsuario){
        return new ResponseEntity<>(predioUsuarioService.save(predioUsuario), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PredioUsuario> actualizarPredioUsuario(@RequestBody PredioUsuario predioUsuario){
        return new ResponseEntity<>(predioUsuarioService.update(predioUsuario), HttpStatus.OK);
    }
}
