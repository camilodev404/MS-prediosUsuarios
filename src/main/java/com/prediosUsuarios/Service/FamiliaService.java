package com.prediosUsuarios.Service;

import com.prediosUsuarios.Model.Familia;
import com.prediosUsuarios.Respository.FamiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamiliaService {

    @Autowired
    FamiliaRepository familiaRepository;

    public List<Familia> getAll(){
        return familiaRepository.findAll();
    }

    public Optional<Familia> getById(String idFamiliar){
        return familiaRepository.findById(idFamiliar);
    }

    public Familia save(Familia familia){
        return familiaRepository.save(familia);
    }

    public Familia update(Familia familia){
        return familiaRepository.save(familia);
    }

}
