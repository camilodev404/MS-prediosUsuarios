package com.prediosUsuarios.Service;

import com.prediosUsuarios.Model.PredioUsuario;
import com.prediosUsuarios.Model.PredioUsuarioId;
import com.prediosUsuarios.Respository.PredioUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PredioUsuarioService {

    @Autowired
    PredioUsuarioRepository predioUsuarioRepository;

    public List<PredioUsuario> getAll(){
        return predioUsuarioRepository.findAll();
    }

    public Optional<PredioUsuario> getById(PredioUsuarioId predioUsuarioId){
        return predioUsuarioRepository.findById(predioUsuarioId);
    }

    public PredioUsuario save(PredioUsuario predioUsuario){
        return predioUsuarioRepository.save(predioUsuario);
    }

    public PredioUsuario update(PredioUsuario predioUsuario){
        return predioUsuarioRepository.save(predioUsuario);
    }

}
