package com.prediosUsuarios.Service;

import com.prediosUsuarios.Model.Documento;
import com.prediosUsuarios.Respository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    DocumentoRepository documentoRepository;

    public List<Documento> getAll(){
        return documentoRepository.findAll();
    }

    public Optional<Documento> getById(String idDocumento){
        return documentoRepository.findById(idDocumento);
    }

    public Documento save(Documento documento){
        return documentoRepository.save(documento);
    }

    public Documento update(Documento documento){
        return documentoRepository.save(documento);
    }

}
