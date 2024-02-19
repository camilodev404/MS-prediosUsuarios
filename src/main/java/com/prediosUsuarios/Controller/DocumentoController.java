package com.prediosUsuarios.Controller;

import com.prediosUsuarios.Model.Documento;
import com.prediosUsuarios.Service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documento")
@CrossOrigin("*")
public class DocumentoController {

    @Autowired
    DocumentoService documentoService;

    @GetMapping
    public ResponseEntity<List<Documento>> getDocumento(){
        return new ResponseEntity<>(documentoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idDocumento}")
    public ResponseEntity<Documento> documentoById(@PathVariable("idDocumento") String idDocumento){
        return documentoService.getById(idDocumento).map(documento -> new ResponseEntity<>(documento, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Documento> guardarDocumento(@RequestBody Documento documento){
        return new ResponseEntity<>(documentoService.save(documento), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Documento> actualizarDocumento(@RequestBody Documento documento){
        return new ResponseEntity<>(documentoService.update(documento), HttpStatus.OK);
    }

}
